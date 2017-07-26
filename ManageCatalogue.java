package Library;

import java.util.HashMap;
import java.util.Scanner;

public interface ManageCatalogue {

	public default void ConsoleMenu() {

		int selection = 0;
		Catalogue x = new Catalogue();
		Scanner input = new Scanner(System.in);

		while (selection != 4) {
			System.out.println("1. Add a new item");
			System.out.println("2. Delete an item");
			System.out.println("3. See the entire catalogue");
			selection = input.nextInt();
		} // need to parse it back into an integer?

		switch (selection) {
		case 1: // add a new item
			Integer itemId = 0;
			String itemName;

			System.out.println("Enter the new Item ID number: ");
			itemId = input.nextInt();
			System.out.println("Enter the new item name: ");
			itemName = input.nextLine();
			Catalogue.collection.put(itemId, itemName);
			break;

		case 2: // delete an item

			System.out.println("Enter the ID number of the item you want to delete: ");
			itemId = input.nextInt();
			System.out.println("Enter the name of the item you want to delete: ");
			itemName = input.nextLine();
			Catalogue.delLibraryItemById(itemId);
			break;
		case 3: // see the collection database
			System.out.println("Here are all the items currently in the database:");
			@SuppressWarnings("unused") HashMap<Integer, String> collection = x.getCatalogue();

		default:
			System.out.println("Please enter an accepted value");
		}
		input.close();
		}
}
