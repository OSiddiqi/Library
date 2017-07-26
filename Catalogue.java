package Library;


import java.util.HashMap;
import java.util.Iterator;
/*import java.util.Map;*/
import java.util.Map.Entry;

public class Catalogue implements ManageCatalogue{
	static HashMap<Integer, String> collection;

	/*
	 * ArrayList<LibraryItem> collection = new ArrayList<LibraryItem>();
	 */

	public Catalogue() {
		collection = new HashMap<>();
	}

	public void addLibraryItem(int itemId, String itemName) {
		collection.put(itemId, itemName);
	}
	public static void delLibraryItemById(int itemId){
		collection.remove(itemId);
		for (Iterator<Entry<Integer, String>> it = collection.entrySet().iterator(); it.hasNext();) {
			 Entry<Integer, String> e = it.next();
			 if (e.equals(e.getValue())) {
			 it.remove();
			 }}
			 }
	public static void delLibraryItemByName(String itemName){
		collection.remove(itemName);
		for (Iterator<Entry<Integer, String>> it = collection.entrySet().iterator(); it.hasNext();) {
			Entry<Integer, String> n = it.next();
				if (n.equals(n.getValue())) {
				it.remove();
	}}

	}

	public HashMap<Integer, String> getCatalogue() {
		return collection;
	}

	{
		Catalogue c = new Catalogue();
		c.addLibraryItem(1, "The Book");
		c.addLibraryItem(2, "Library is here");

		for (HashMap.Entry<Integer, String> entry : c.getCatalogue().entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}