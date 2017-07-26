package Library;

import java.util.Scanner;

public interface SearchCatalogue{

	public default void ConsoleMenu() {

		
		}
	public default void searchCatalogue() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the item ID you are looking for: ");
		in.nextInt();
		if (Catalogue.collection.containsKey(in)) {
			System.out.println("Item found");
		} else {
			System.out.println("Item not found");
		}
	}

}

/*
 * while (selection !=5) { System.out.println("1. Add a new item");
 * System.out.println("2. Delete an item by ID");
 * System.out.println("3. Delete an item by name");
 * System.out.println("4. See all items"); selection = input.nextInt(); } int e;
 * String n; switch(selection) { case 1: //add an item int itemId = 0; String
 * itemName;
 * 
 * Scanner inputReg = new Scanner(System.in);
 * 
 * System.out.println("Enter the new item ID: "); itemId = input.nextInt();
 * System.out.println("Enter full name: "); itemName = input.nextLine();
 * System.out.println("Enter Date of birth in the format DD/MM/YYYY"); String
 * date=inputReg.nextLine(); DateFormat theDate = new
 * SimpleDateFormat("d/M/yyyy", Locale.ENGLISH); Date dOB = theDate.parse(date);
 * 
 * LibraryItem.collection.add(itemId, itemName); break;
 * 
 * case 2: //delete an item by ID
 * System.out.println("Enter the item ID you want to delete: "); e =
 * input.nextInt(); Catalogue.delLibraryItemById(e); break;
 * 
 * case 3: //delete an item by name
 * System.out.println("Enter the item name you want to delete: "); n =
 * input.nextLine(); Catalogue.delLibraryItemByName(n); case 4: //see the
 * catalogue
 * System.out.println("Here are all the items currently in the database: "
 * +Catalogue.collection);
 * 
 * default: System.out.println("Please enter an accepted value"); }
 * input.close(); } }
 */