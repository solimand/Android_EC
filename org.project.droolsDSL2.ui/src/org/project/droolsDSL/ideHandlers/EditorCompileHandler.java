package org.project.droolsDSL.ideHandlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
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
					JavaCore.newLibraryEntry(new Path(
							"C:\\Users\\SOLI\\Desktop\\Model_Session_Library.jar"), 
							null, null, false);
			
			newEntries[entries.length] = modelSessionLibEntry;
			
			try {
				javaProj.setRawClasspath(newEntries, null);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
	
	/*________________________________________________________________________________________*/
	
			MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			box.setMessage("Executing: " + "aggiunto Model.jar");
			box.open();		return box;
		}
		else{
			MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			box.setMessage("Executing: " + "Model.Jar presente");
			box.open();		return box;
		}

	}

	
}
