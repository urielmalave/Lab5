package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object args) {
		// TODO Auto-generated method stub
		DMComponent dm = (DMComponent) args; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDeleting and existing list of the system:\n"); 
		String listName = io.getInput("\nEnter name of the list to remove: "); 
		dm.removeList(listName); 
	}

}
