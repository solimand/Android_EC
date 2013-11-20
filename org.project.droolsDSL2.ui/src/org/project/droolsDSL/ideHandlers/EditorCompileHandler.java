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
	public static final String APPLICATION_NAME = "APPLICATION_NAME";
	public static final String MODEL_LIB_NAME_MVN = "Model_Lib-1.0.jar"; 						//ArtifactID
	public static final String ANDROID_SUPPORT_LIB_NAME_MVN = "Android_Support_Lib-0.1.jar";  	//ArtifactID
	public static final String PATH_SUPPORT_STRING = "C:\\Users\\Soli\\Desktop\\SUPPORT";	
	public static final String PATH_MAVEN_REPO_WIN_STRING = System.getProperty("user.home")+"\\.m2\\repository";
	public static final String PACKAGE_NAME = "com.gradle.application.medicalec";
	
	/** CMD */
	public static final String switchPathtoLib = "cd C:/Users/Soli/Desktop/SUPPORT/libs ";
	@Inject
    IResourceSetProvider resourceSetProvider;
 
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

/*________________________________________________________________________________________*/
	/**_____MVN install_____**/
		
		Runtime rt = Runtime.getRuntime();
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
	/**_____ADD Stefano Library_____**/ /*per la compilazione*/
		
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

		//control duplicate classpath entry
		boolean duplicateClasspath = false;
		for (IClasspathEntry entry : entries){
			if (entry.getPath().toString().contains(MODEL_LIB_NAME_MVN)) duplicateClasspath=true;
		}
		
		if (!duplicateClasspath){
			IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];
			
			System.arraycopy(entries, 0, newEntries, 0, entries.length);
	
			//si può aggiungere -source archive location AND root path-
			IClasspathEntry modelSessionLibEntry =
					JavaCore.newLibraryEntry(new Path(PATH_MAVEN_REPO_WIN_STRING+"\\it\\bragaglia\\freckles\\Model_Lib\\1.0\\Model_Lib-1.0.jar"), 
							null, null, false);
			
			newEntries[entries.length] = modelSessionLibEntry;
			
			try {
				javaProj.setRawClasspath(newEntries, null);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
			
			System.out.println("Model Added to Libraries");

		}
		else{
//			MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
//			box.setMessage("Executing: " + "Model_Lib.Jar presente");
//			box.open();		return box;

			System.out.println("Model_Lib.Jar presentes");
		}
		
/*________________________________________________________________________________________*/
	/**_____ADD App Resource_____**/
			
//		IFolder libsFolder = proj.getFolder(APPLICATION_NAME+"\\libs");
		IFolder drawableFolder = proj.getFolder(APPLICATION_NAME+"\\res\\drawable");
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  
		IWorkspaceRoot workSpaceRoot = workspace.getRoot();
		
		//create folder
		/*if (!libsFolder.exists())
			try {libsFolder.create(IResource.NONE, true, null);}
				catch (CoreException e) {e.printStackTrace();}
		*/
		
		if (!drawableFolder.exists())
			try {drawableFolder.create(IResource.NONE, true, null);}
				catch (CoreException e) {e.printStackTrace();}
		
		//create files
		/*copyFileInWorkspace(
				proj, 
				proj.getFile(APPLICATION_NAME+"\\libs\\Model_Session_Library.jar"),
				PathSupportString+"\\libs\\Model_Session_Library.jar", 
				workSpaceRoot.getLocation().toString()+proj.getFullPath()+
						"\\"+APPLICATION_NAME+"\\libs\\Model_Session_Library.jar"
		);
		
		copyFileInWorkspace(
				proj, 
				proj.getFile(APPLICATION_NAME+"\\libs\\android-support-v4.jar"),
				PathSupportString+"\\libs\\android-support-v4.jar", 
				workSpaceRoot.getLocation().toString()+proj.getFullPath()+
						"\\"+APPLICATION_NAME+"\\libs\\android-support-v4.jar"
		);
		
		
		*/
		
		if(copyFileInWorkspace(
				proj,
				proj.getFile(APPLICATION_NAME+"\\src\\MainModel.java"),
				workSpaceRoot.getLocation().toString()+proj.getFullPath()+
					"\\src-gen\\models\\MainModel.java",
				workSpaceRoot.getLocation().toString()+proj.getFullPath()+
					"\\"+APPLICATION_NAME+"\\src\\com.gradle.application.medicalec\\MainModel.java"		
		)){
			System.out.println("File: " + "MainModel.java" + " DONE." );
		}
		else{
			System.out.println("File"+ "MainModel.java" + " already exists.");
		}
		
		
		if(copyFileInWorkspace(
				proj, 
				proj.getFile(APPLICATION_NAME+"\\drawable\\ic_launcher.png"),
				PATH_SUPPORT_STRING+"\\drawable\\ic_launcher.png", 
				workSpaceRoot.getLocation().toString()+proj.getFullPath()+
						"\\"+APPLICATION_NAME+"\\res\\drawable\\ic_launcher.png"
		)){
			System.out.println("File: " + "ic_launcher.png" + " DONE." );
		}
		else{
			System.out.println("File"+ "ic_launcher.png" + " already exists.");
		}
		
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

	
}
