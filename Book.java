package Library;

public abstract class Book {

	String authorName;
	String bookTitle;

	public Book(String authorName, String bookTitle) {

		this.authorName = authorName;
		this.bookTitle = bookTitle;
		/*
		 * BookCollection.add(bookTitle, authorName); book.addBook(); = new
		 * Book("The Book", "John Boy");
		 */

	}

	public String toString() {
		return "authorName: " + this.authorName + " bookTitle: " + this.bookTitle;
	}
}