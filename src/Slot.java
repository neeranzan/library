/**
 * 
 * @author niranjanhumagain
 *
 */
public class Slot {

	private int shelfID;
	private int slotID;// slotID would simply be a number ranging from 0-9
	private Book b = null;

	public Slot(int ShelfID, int slotID) {
		this.shelfID = shelfID;
		this.slotID = slotID;
	}

	void addBook(Book b) {
		this.b = b;
		b.Shelf();
	}

	void removeBook() {
		this.b.UnShelf();
		this.b = null;
	}

	int getSlot() {
		return this.slotID;
	}

	Book getBook() {
		return this.b;
	}

}// end of class