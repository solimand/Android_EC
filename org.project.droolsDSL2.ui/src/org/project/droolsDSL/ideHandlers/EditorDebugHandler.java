package org.project.droolsDSL.ideHandlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.runtime.Path;

public class EditorDebugHandler extends AbstractHandler{

	//application constant
	final String APPLICATION_NAME = "APPLICATION_NAME";
	final IPath BUILD_GRADLE_PATH = new Path("APPLICATION_NAME");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		//retrieve build.gradle
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
		
		//control reference library
		boolean reference = false;
		for (IClasspathEntry entry : entries){
			if (entry.getPath().toString().contains("Model_Session_Library.jar")) reference=true;
		}
		
		if (reference){
			System.out.println("REF to Model present");			
			
			//control build.gradle
			IFolder gradleFolder = proj.getFolder("src-gen/"+APPLICATION_NAME);

			if (gradleFolder.exists()) {
				System.out.println("Gradle Path present");
				//continue gradle build
				return null;
			}
			else{// Warning no gradle
				MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
				box.setMessage("Executing: " + "NO Gradle PAth");
				box.open(); return box;
			}

			
		}
		else{//Warning no REF to model
			MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			box.setMessage("Executing: " + "NO Ref to Model");
			box.open();		return box;
		}
		
	}
}
