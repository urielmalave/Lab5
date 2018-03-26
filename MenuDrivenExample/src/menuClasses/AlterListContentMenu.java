package menuClasses;

import java.util.ArrayList;

public class AlterListContentMenu extends Menu {
	private static AlterListContentMenu ALC = new AlterListContentMenu(); 
	public AlterListContentMenu() { 
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Alter List Content:"; 
		options.add(new Option("Add a new value to a List", new AddToListAction())); 
		options.add(new Option("Delete a position from a List", new DeleteFromListAction())); 
		options.add(new Option("Show content a List", new ShowListAction())); 

		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 

	}
	
	public static AlterListContentMenu getAlterListContentMenu() { 
		return ALC; 
	}

}
