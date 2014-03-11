package org.project.droolsDSL.ideHandlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import com.google.inject.Inject;

public class EditorCompileHandler extends AbstractHandler implements IHandler {

	/** STRING*/
	public static final String MODEL_LIB_NAME_MVN = "Model_Java-0.0.1-SNAPSHOT.jar";			//ArtifactID
	public static final String SESSION_LIB_NAME_MVN = "Session_Java-0.0.1-SNAPSHOT.jar";		//ArtifactID
	public static final String PATH_MAVEN_REPO_WIN_STRING = System.getProperty("user.home")+"\\.m2\\repository";
	public static final String PACKAGE_NAME = "com.gradle.application.medicalec";
	public static final String PACKAGE_MVN_NAME = "org\\project\\droolsDSL";
	public static final String MODEL_LIB_PATH_MVN = PATH_MAVEN_REPO_WIN_STRING+PACKAGE_MVN_NAME+"\\Model_Java\\0.0.1-SNAPSHOT";
	public static final String SESSION_LIB_PATH_MVN = PATH_MAVEN_REPO_WIN_STRING+PACKAGE_MVN_NAME+"\\Session_Java\\0.0.1-SNAPSHOT";


	/** Folder Provided to the User*/
	public static final String PATH_SUPPORT_STRING = "C:\\Users\\Soli\\Desktop\\SUPPORT";

	final String APPLICATION_NAME = "MedicalEC";
	
	/** CMD */
	public static final String switchPathtoLib = "cd C:/Users/Soli/Desktop/SUPPORT/libs ";
	
	@Inject
    IResourceSetProvider resourceSetProvider;
 
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

/*________________________________________________________________________________________*/
	/**_____MVN install_____**/
		
//		Runtime rt = Runtime.getRuntime();
//		try {
//			Process pr;
//			pr=rt.exec(
////				"cd "+PathSupportString+"\\libs"
//					switchPathtoLib
//			);
			/*
			pr = rt.exec(
				"mvn install:install-file "
				+ "-Dfile=android-support-v4.jar "
				+ "-DgroupId=com.google "
				+ "-DartifactId=android-support-v4 "
				+ "-Dversion=0.1 -Dpackaging=jar"
			);
			System.out.println("android support in Maven Local Repo. DONE.");

			
			pr = rt.exec(
					"mvn install:install-file "
					+ "-Dfile=Model_Session_Library.jar "
					+ "-DgroupId=com.gradle.application.medicalec "
					+ "-DartifactId=Model_Session_Library "
					+ "-Dversion=0.1 -Dpackaging=jar"
			);
			*/
//			System.out.println("Model in Maven Local Repo. DONE.");
//		} catch (IOException e1) {e1.printStackTrace();}
		
/*________________________________________________________________________________________*/
	/**_____ADD Library_____**/
		
		IWorkbenchPage wbPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		IFileEditorInput fileEditoriInput =  (IFileEditorInput) wbPage.getActiveEditor().getEditorInput();
		
		IProject proj = fileEditoriInput.getFile().getProject();
		
		IJavaProject javaProj = JavaCore.create(proj);
		
		IClasspathEntry[] entries = null;

		try {
			entries = javaProj.getRawClasspath();
		} catch (JavaModelException e) {
			e.printStackTrace();
		}

		//control duplicate classpath entries 
		boolean duplicateClasspath = false;
		for (IClasspathEntry entry : entries){
			if (entry.getPath().toString().contains(MODEL_LIB_NAME_MVN)) duplicateClasspath=true;
			if (entry.getPath().toString().contains(SESSION_LIB_NAME_MVN)) duplicateClasspath=true;
		}
		
		if (!duplicateClasspath){
			/** Add Model*/
			IClasspathEntry[] newEntriesModel = new IClasspathEntry[entries.length + 1];			
			System.arraycopy(entries, 0, newEntriesModel, 0, entries.length);
	
			IClasspathEntry modelLibEntry =
					JavaCore.newLibraryEntry(new Path(PATH_MAVEN_REPO_WIN_STRING+"\\"+PACKAGE_MVN_NAME+"\\Model_Java\\0.0.1-SNAPSHOT\\"+MODEL_LIB_NAME_MVN), 
							null, null, false);
			newEntriesModel[entries.length] = modelLibEntry;
			try {
				javaProj.setRawClasspath(newEntriesModel, null);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
			
			/** Add Session*/
			IClasspathEntry[] newEntriesSession = new IClasspathEntry[newEntriesModel.length + 1];			
			System.arraycopy(newEntriesModel, 0, newEntriesSession, 0, newEntriesModel.length);
	
			IClasspathEntry sessionLibEntry =
					JavaCore.newLibraryEntry(new Path(PATH_MAVEN_REPO_WIN_STRING+"\\"+PACKAGE_MVN_NAME+"\\Session_Java\\0.0.1-SNAPSHOT\\"+SESSION_LIB_NAME_MVN), 
							null, null, false);
			newEntriesSession[newEntriesModel.length] = sessionLibEntry ;
			
			try {
				javaProj.setRawClasspath(newEntriesSession, null);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
			
			System.out.println("Model and Session Added to Libraries");

		}
		else{
			System.out.println("Library already exists");
		}
		
/*________________________________________________________________________________________*/
	/**_____ADD App Resource_____**/
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  
		IWorkspaceRoot workSpaceRoot = workspace.getRoot();
		
		File drawSource = new File(PATH_SUPPORT_STRING+"\\drawable");
		File drawDest = new File(workSpaceRoot.getLocation().toString()+proj.getFullPath()+
					"\\"+APPLICATION_NAME+"\\res");
		File libsDest = new File(workSpaceRoot.getLocation().toString()+proj.getFullPath()+
				"\\"+APPLICATION_NAME+"\\libs");
		libsDest.mkdir();
		
		//add android dependencies
		if(copyFileInWorkspace(
				proj,
				proj.getFile(APPLICATION_NAME+"\\libs\\"+MODEL_LIB_NAME_MVN),
				PATH_MAVEN_REPO_WIN_STRING+"\\org\\project\\droolsDSL\\Model_Java\\0.0.1-SNAPSHOT\\"+MODEL_LIB_NAME_MVN,
				workSpaceRoot.getLocation().toString()+proj.getFullPath()+
					"\\"+APPLICATION_NAME+"\\libs\\"+MODEL_LIB_NAME_MVN
		)){
			System.out.println("\n\tFile: \n Model Android Library added \t DONE." );
		}
		else{
			System.out.println("Android Libraries already exist.");
		}
		if(copyFileInWorkspace(
				proj,
				proj.getFile(APPLICATION_NAME+"\\libs\\"+SESSION_LIB_NAME_MVN),
				PATH_MAVEN_REPO_WIN_STRING+"\\org\\project\\droolsDSL\\Session_Java\\0.0.1-SNAPSHOT\\"+SESSION_LIB_NAME_MVN,
				workSpaceRoot.getLocation().toString()+proj.getFullPath()+
					"\\"+APPLICATION_NAME+"\\libs\\"+SESSION_LIB_NAME_MVN
		))
		{
			System.out.println("\n\tFile: \n Session Android Library added \t DONE." );
		}
		else{
			System.out.println("Android Libraries already exist.");
		}
		
		//adding drawables (many folder)
		try{
			copyFolderIntoWorkspace(drawSource, drawDest);
			System.out.println("File: " + "ic_launcher.png" + " DONE." );
		}
		
		catch (IOException e) {e.printStackTrace();}
		
		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		box.setMessage("Executing: " + "aggiunto Model.jar &&& folders &&& files...");
		box.open();		return box;
	}
	
	
	/**
	 * 
	 * @param projDest 		--> output project
	 * @param handleDest	--> output full path (use <project>.getFile(...))
	 * @param pathSource	--> source full path
	 * @param pathDest		--> dest full path
	 */
	private boolean copyFileInWorkspace (IProject projDest, IFile handleDest, String pathSource, String pathDest){
		if (!handleDest.exists()){
			File src = new File(pathSource);
			File dest = new File(pathDest);
			
			InputStream in = null;
			try {in = new FileInputStream(src);} catch (FileNotFoundException e) {e.printStackTrace();}
			
			OutputStream out = null;
			try {
				if (!dest.exists()){dest.createNewFile();}
				out = new FileOutputStream(dest, true);
			} 
			catch (FileNotFoundException e) {e.printStackTrace();} 
			catch (IOException e) {e.printStackTrace();}

			byte[] buf = new byte[1024];
			int len;
			try {
				while ((len = in.read(buf)) > 0){
					out.write(buf, 0, len);
				}
				
			} catch (IOException e) {e.printStackTrace();}
			
			try {in.close();} catch (IOException e) {e.printStackTrace();}
			
			try {out.close();} catch (IOException e) {e.printStackTrace();}
			
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * UTIL for drawable
	 */
	public static void copyFolderIntoWorkspace(File src, File dest) throws IOException{
		
    	if(src.isDirectory()){
 
    		if(!dest.exists()) dest.mkdir();
 
    		//list all the directory contents
    		String files[] = src.list();
 
    		for (String file : files) {
    		   //construct the src and dest file structure
    		   File srcFile = new File(src, file);
    		   File destFile = new File(dest, file);
    		   //recursive copy
    		   copyFolderIntoWorkspace(srcFile,destFile);
    		}
 
    	}
    	else{
    		InputStream in = new FileInputStream(src);
    		OutputStream out = new FileOutputStream(dest); 
 
    		byte[] buffer = new byte[1024];
 
    		int length;
   	        while ((length = in.read(buffer)) > 0){
   	    	   out.write(buffer, 0, length);
   	        }

   	        in.close();
   	        out.close();
    	}
    }
}
