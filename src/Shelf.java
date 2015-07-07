import java.util.*;

/**
 * 
 * @author niranjanhumagain
 * 
 * 
 */
public class Shelf {

	private int shelfID;
	private String name;
	private ArrayList<Slot> slots;

	/**
	 * add book to slot
	 * 
	 * @param s
	 * @param b
	 */
	void addBook(Slot s, Book b) {
		if (s.getBook() != null) {
			s.addBook(b);
			System.out.println("Book" + b.getName() + " is added in Shelf "
					+ this.getName() + " and slot" + s.getSlot() + "");
		} else {
			System.out.println("Book" + b.getName()
					+ " cannot be added in Shelf " + this.getName()
					+ " and slot" + s.getSlot() + " because "
					+ s.getBook().getName() + " is already there ");
		}
	}

	void removeBook(Slot s) {
		s.removeBook();
		System.out.println("Book" + s.getBook().getName()
				+ " is removed from Shelf " + this.getName() + " and slot"
				+ s.getSlot() + "");
	}

	String getName() {
		return this.name;
	}

	// generally slots are not removed/added ,they are fixed, but still we want
	// to make our system flexible

	void addSlots(Slot s) {
		slots.add(s);
	}

	void removeSlots(Slot s) {
		slots.remove(s);
	}

	ArrayList<Slot> getSlots() {
		return this.slots;
	}

}
