package org.project.droolsDSL.ideHandlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class EditorDeployHandler extends AbstractHandler{

	/** STRING*/
	public static final String APPLICATION_NAME = "MedicalEC";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		/** Exec Gradle Build*/
		try {
			IWorkbenchPage wbPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IFileEditorInput fileEditoriInput =  (IFileEditorInput) wbPage.getActiveEditor().getEditorInput();			
			IProject proj = fileEditoriInput.getFile().getProject();
			IWorkspace workspace = ResourcesPlugin.getWorkspace();  
			IWorkspaceRoot workSpaceRoot = workspace.getRoot();
			
			String applicationPath = workSpaceRoot.getLocation().toString()+proj.getFullPath()+
			"\\"+APPLICATION_NAME;
			
			Runtime runtime = Runtime.getRuntime();

			Process proc = runtime.exec(new String[] {"cmd.exe ", "/C", "gradle clean installDebug"}, 
					null, 
					new File(applicationPath));
			
			InputStream is = proc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				if (line.equals("BUILD SUCCESSFUL")){
					MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
					box.setMessage("\nAPP is on Device!!\n");
					box.open();		return box;
				}
			}

		} 
		catch (IOException e) {e.printStackTrace();} 
		System.out.println("Main: DONE...");

		return null;		
	}
}
