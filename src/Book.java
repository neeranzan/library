/**
 * 
 * @author niranjanhumagain
 *
 */
public class Book {

	private String name;
	private String author;
	private boolean isShelfed;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	/**
	 * mark as shelfed
	 */
	void Shelf() {
		this.isShelfed = true;
	}

	/**
	 * mark as unshelf
	 */
	void UnShelf() {
		this.isShelfed = false;
	}

	/**
	 * check if the book is currently in any shelf
	 * 
	 * @return
	 */
	boolean isShelfed() {
		return this.isShelfed;
	}

	String getName() {
		return this.name;

	}

	void changeName(String name) {
		this.name = name;
	}

	String getAuthor() {
		return this.author;

	}

	void changeAuthor(String newAuthor) {
		this.author = newAuthor;
	}
}
