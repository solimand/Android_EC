package org.project.droolsDSL.ideHandlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;

public class EditorCompileHandler extends AbstractHandler {

	
//	public void run(IAction action) {
//		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
//		box.setMessage("Executing: " + getClass());
//		box.open();
//	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		box.setMessage("Executing: " + getClass());
		box.open();		return box;
	}

}
