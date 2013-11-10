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

	public static final String APPLICATION_NAME = "APPLICATION_NAME";
	
	public static final String PathModelLibString = "C:\\Users\\SOLI\\Desktop\\SUPPORT\\libs\\Model_Session_Library.jar";	
	public static final String PathotherLib1String = "C:\\Users\\SOLI\\Desktop\\SUPPORT\\libs\\android-support-v4.jar";

	public static final String drawableIconString = "C:\\Users\\SOLI\\Desktop\\SUPPORT\\drawable\\ic_launcher.png";	

	@Inject
    IResourceSetProvider resourceSetProvider;
 
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
/*________________________________________________________________________________________*/
	/**_____ADD Stefano Library_____**/
		
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
			if (entry.getPath().toString().contains("Model_Session_Library.jar")) duplicateClasspath=true;
		}
		
		if (!duplicateClasspath){
			IClasspathEntry[] newEntries = new IClasspathEntry[entries.length + 1];
			
			System.arraycopy(entries, 0, newEntries, 0, entries.length);
	
			//come inserire path statica??? magari da git/maven?
			//si può aggiungere -source archive location AND root path-
			IClasspathEntry modelSessionLibEntry =
					JavaCore.newLibraryEntry(new Path(PathModelLibString), 
							null, null, false);
			
			newEntries[entries.length] = modelSessionLibEntry;
			
			try {
				javaProj.setRawClasspath(newEntries, null);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
			
			System.out.println("Added Model to Libraries");

		}
		else{
			MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			box.setMessage("Executing: " + "Model.Jar presente");
			box.open();		return box;
		}
		
/*________________________________________________________________________________________*/
	/**_____ADD App Resource_____**/
			
	IFolder libsFolder = proj.getFolder(APPLICATION_NAME+"\\libs");
	IFolder drawableFolder = proj.getFolder(APPLICATION_NAME+"\\res\\drawable");
	
	File src =null;
	File dest=null;
	
	IWorkspace workspace = ResourcesPlugin.getWorkspace();  
	IWorkspaceRoot workSpaceRoot = workspace.getRoot();
	
	//create folder
	if (!libsFolder.exists())
		try {libsFolder.create(IResource.NONE, true, null);}
			catch (CoreException e) {e.printStackTrace();}
	
	if (!drawableFolder.exists())
		try {drawableFolder.create(IResource.NONE, true, null);}
			catch (CoreException e) {e.printStackTrace();}
	
	//create file
	if (!proj.getFile(APPLICATION_NAME+"\\libs\\Model_Session_Library.jar").exists()){
		src = new File(PathModelLibString);
		dest = new File(workSpaceRoot.getLocation().toString()
				+proj.getFullPath()+"\\"+APPLICATION_NAME+"\\libs\\Model_Session_Library.jar");
		
		InputStream in = null;
		try {in = new FileInputStream(src);} catch (FileNotFoundException e) {e.printStackTrace();}
		
		OutputStream out = null;
		try {out = new FileOutputStream(dest, true);} catch (FileNotFoundException e) {e.printStackTrace();}
	
		byte[] buf = new byte[1024];
		int len;
		try {
			while ((len = in.read(buf)) > 0){
				out.write(buf, 0, len);
			}
		} catch (IOException e) {e.printStackTrace();}
		
		try {in.close();} catch (IOException e) {e.printStackTrace();}
		
		try {out.close();} catch (IOException e) {e.printStackTrace();}
		
		System.out.println("Added Jar 1 to APP-libs");
	}
	

	if (!proj.getFile(APPLICATION_NAME+"\\libs\\android-support-v4.jar").exists()){
		src = new File(PathotherLib1String);
		dest = new File(workSpaceRoot.getLocation().toString()
				+proj.getFullPath()+"\\"+APPLICATION_NAME+"\\libs\\android-support-v4.jar");
		
		InputStream in = null;
		try {in = new FileInputStream(src);} catch (FileNotFoundException e) {e.printStackTrace();}
		
		OutputStream out = null;
		try {out = new FileOutputStream(dest, true);} catch (FileNotFoundException e) {e.printStackTrace();}
	
		byte[] buf = new byte[1024];
		int len;
		try {
			while ((len = in.read(buf)) > 0){
				out.write(buf, 0, len);
			}
		} catch (IOException e) {e.printStackTrace();}
		
		try {in.close();} catch (IOException e) {e.printStackTrace();}
		
		try {out.close();} catch (IOException e) {e.printStackTrace();}
		
		System.out.println("Added Jar 2 to APP-libs");
	}

	if (!proj.getFile(APPLICATION_NAME+"\\res\\drawable\\ic_launcher.png").exists()){
		src = new File(drawableIconString);
		dest = new File(workSpaceRoot.getLocation().toString()
				+proj.getFullPath()+"\\"+APPLICATION_NAME+"\\res\\drawable\\ic_launcher.png");
		
		InputStream in = null;
		try {in = new FileInputStream(src);} catch (FileNotFoundException e) {e.printStackTrace();}
		
		OutputStream out = null;
		try {out = new FileOutputStream(dest, true);} catch (FileNotFoundException e) {e.printStackTrace();}

		byte[] buf = new byte[1024];
		int len;
		try {
			while ((len = in.read(buf)) > 0){
				out.write(buf, 0, len);
			}
		} catch (IOException e) {e.printStackTrace();}
		
		try {in.close();} catch (IOException e) {e.printStackTrace();}
		
		try {out.close();} catch (IOException e) {e.printStackTrace();}
	}
	
	MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
	box.setMessage("Executing: " + "aggiunto Model.jar &&& libs folder &&& model..."+ dest.getName());
	box.open();		return box;
	
	}
	
	
	
//PROVA DA SISTEMARE
	/*
	private void copyFileInWorkspace (IProject projDest, IFile handleDest, String pathSource, String pathDest){
		if (!handleDest.exists()){
			File src = new File(pathSource);
			File dest = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()
					+projDest.getFullPath()+handleDest.getFullPath());
			
			InputStream in = null;
			try {in = new FileInputStream(src);} catch (FileNotFoundException e) {e.printStackTrace();}
			
			OutputStream out = null;
			try {out = new FileOutputStream(dest, true);} catch (FileNotFoundException e) {e.printStackTrace();}

			byte[] buf = new byte[1024];
			int len;
			try {
				while ((len = in.read(buf)) > 0){
					out.write(buf, 0, len);
				}
			} catch (IOException e) {e.printStackTrace();}
			
			try {in.close();} catch (IOException e) {e.printStackTrace();}
			
			try {out.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
*/
	
}
