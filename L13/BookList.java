/**
 * @author kathryn.buckley
 */
public class BookList {
	private BookPointer head;
	public BookList() {
		this.head = null;
	}
	/**
	 * Returns true if the list is empty, false otherwise.
	 *
	 * @return true if the list is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return this.head == null ? true : false;
	}
	/**
	 * Returns the number of items currently in the list.
	 *
	 * @return the number of items currently in the list
	 */
	public int size() {
		if (this.head == null) {
			return 0;
		}
		if (this.head.getNext() == null) {
			return 1;
		}
		int counter = 1;
		BookPointer current = head;
		while (current.getNext() != null) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}
	public int borrowedSize() {
		if (this.head == null) {
			return 0;
		}
		if (this.head.getNext() == null && this.head.getValue().isTaken() == true) {
			return 1;
		}
		int counter = 0;
		BookPointer current = head;
		while (current.getNext() != null && current.getValue().isTaken() == true) {
			counter++;
			current = current.getNext();
		}
		return counter;
	}
	/**
	 * Returns the element at the given position.
	 *
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 *
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message
	 */

	public Book findBook(String title) {
		if (this.isEmpty()) {
			return null;
		}
		if (this.size() == 1) {
			if (this.head.getValue().getTitle() == title) {
				return head.getValue();
			} else {
				return null;
			}
		}
		BookPointer current = head;
		while (current.getNext() != null) {
			if (current.getValue().getTitle() == title) {
				return current.getValue();
			}
			current = current.getNext();
		}
		return null;
	}

	/**
	* Finds an element of the list, given the index. The index provided must be above zero
	* and should be validated before use.
	* @param index the position at which the item can be found
	* @return a pointer to the element
	*/
	protected BookPointer findObject (int index) {
		if (index > this.size()) {
			return null;
		}
		int counter = 0;
		BookPointer current = this.head;
		while (counter < index && current != null) {
			current = current.getNext();
			counter++;
		}
		return current;
	}

	public void add(Book item) {
		if (item == null) {
			return;
		}
		BookPointer insertItem = new BookPointer(item);
		if (head == null) {
			head = insertItem;
		} else {
			BookPointer lastElement = findObject(this.size() - 1);
			lastElement.setNext(insertItem);
		}
		return;
	}

}
