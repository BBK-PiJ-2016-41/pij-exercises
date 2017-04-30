/**
 * @author kathryn.buckley
 */
public class LinkedList {
	private ObjectPointer head;
	public LinkedList() {
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
		ObjectPointer current = head;
		while (current.getNext() != null) {
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
	public ObjectPointer get(int index) {
		if (this.isEmpty()) {
			return null;
		}
		if (index < 0 || index > this.size()) {
			return null;
		}
		if (index == 0) {
			return this.head;
		}
		ObjectPointer element = findObject(index);
		if (element == null){
			return null;
		} else {
			return element;
		}
	}
	
	public Integer findUserId(String name) {
		if (this.isEmpty()) {
			return -1;
		}
		if (this.size() == 1) {
			if (this.head.getValue() == name) {
				return 0;
			} else {
				return -1;
			}
		}
		ObjectPointer current = head;
		int counter = 0;
		while (current.getNext() != null) {
			if (current.getValue() == name) {
				return counter;
			}
			current = current.getNext();
			counter++;
		}
		return -1;
	}
	public void remove(int index){
		if (this.isEmpty()) {
			return;
		}
		if (index < 0) {
			return;
		}
		if (index == 0) {
			head = head.getNext();
			return;
		}
		ObjectPointer element = findObject(index);
		if (element == null){
			return;
		} else {
			ObjectPointer previous = findObject(index - 1);
			previous.setNext(element.getNext());
			return;
		}
	}
	/**
	* Finds an element of the list, given the index. The index provided must be above zero
	* and should be validated before use.
	* @param index the position at which the item can be found
	* @return a pointer to the element
	*/
	protected ObjectPointer findObject (int index) {
		if (index > this.size()) {
			return null;
		}
		int counter = 0;
		ObjectPointer current = this.head;
		while (counter < index && current != null) {
			current = current.getNext();
			counter++;
		}
		return current;
	}

	public void add(int index, Object item) {
		if (item == null) {
			return;
		}
		if (index < 0 || index > this.size()) {
			return;
		}
		if (this.isEmpty()) {
			this.head = new ObjectPointer(item);
			return;
		}
		if (index == 0) {
			ObjectPointer insert = new ObjectPointer(item);
			insert.setNext(this.head);
			this.head = insert;
			return;
		}
		ObjectPointer element = findObject(index);
		ObjectPointer previous = findObject(index - 1);
		ObjectPointer insert = new ObjectPointer(item);
		previous.setNext(insert);
		insert.setNext(element);
		return;
	}

	/**
	 * Adds an element at the end of the list.
	 *
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 *
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */
	public void add(Object item) {
		if (item == null) {
			return;
		}
		ObjectPointer insertItem = new ObjectPointer(item);
		if (head == null) {
			head = insertItem;
		} else {
			ObjectPointer lastElement = findObject(this.size() - 1);
			lastElement.setNext(insertItem);
		}
		return;
	}
	/**
	* Prints all the items in the list on a single line, separated by a space.
	*/
	public void print() {
		String output = "";
		ObjectPointer current = head;
		while (current != null) {
			output += current.getValue().toString() + " ";
			current = current.getNext();
		}
		System.out.println(output);
	}
}
