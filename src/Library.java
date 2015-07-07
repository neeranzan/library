import java.util.*;

/**
 * 
 * @author niranjanhumagain Libray object that contains shelfs
 */
public class Library {

	ArrayList<Shelf> shelves;

	/**
	 * add shelf
	 * 
	 * @param shelf
	 */
	public void addShelf(Shelf shelf) {
		shelves.add(shelf);
		System.out.println(Constant.shelfAdded);
	}

	/**
	 * remove shelf
	 * 
	 * @param shelf
	 */
	public void removeShelf(Shelf shelf) {
		shelves.remove(shelf);
		System.out.println(Constant.shelfRemoved);
	}

	/**
	 * report book location
	 * 
	 * @param b
	 */
	public void reportBookLocation(Book b) {
		for (Shelf sh : shelves) {
			for (Slot s : sh.getSlots()) {
				if (s.getBook().equals(b)) {
					System.out.println("Book " + b.getName() + " is found at "
							+ sh.getName() + "at slot " + s.getSlot() + "");

				}
			}
		}
	}

	/**
	 * report inventory
	 */
	public void reportInventory() {
		for (Shelf sh : shelves) {
			for (Slot s : sh.getSlots()) {
				if (s.getBook()==null) {
					System.out.println("There is an empty space  found at "
							+ sh.getName() + "at slot " + s.getSlot() + "");

				}
			}
		}
	}

	
	/**
	 * Show Status of library
	 * 
	 */
	public void showStatus()
	{
		for (Shelf sh : shelves) {
			for (Slot s : sh.getSlots()) {
				if (s.getBook() == null) {
					System.out.print("Shelf:"+sh.getName()+"Slot :"+s.getSlot()+"  -" );// '-' means no book
				}
				else
				{
					System.out.print("Shelf:"+sh.getName()+"Slot :"+s.getSlot()+"  B" );//'B' means book is there
 				}
			}
		}
	}

}
