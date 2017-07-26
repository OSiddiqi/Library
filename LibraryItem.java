package Library;

import java.util.ArrayList;

public class LibraryItem {

	int itemId;
	String itemName;

	static ArrayList<String> collection = new ArrayList<String>();
	
	public void addItem(String b) {
		collection.add(b);

	}
}
