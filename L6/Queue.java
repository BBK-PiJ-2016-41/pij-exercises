public class Queue {
	private IntToLink firstInt = null;
	public static int noInts = 0;
	
	// adds new int, after checking if list is empty
	public void insert(IntToLink myInt) {
		if (firstInt == null) {
				firstInt = myInt;
				noInts++;
				return;
			}
		myInt.setNextInt(firstInt);
		firstInt = myInt;
		noInts++;
	}
	
	public int getNoInts() {
		return this.noInts;
	}
	
	public void retrieve() {
		if (firstInt == null) {
			// list is empty nothing to remove
			return;
		}
		
		if (firstInt.getNextInt() == null) {
			// list contains one item
			firstInt = null;
			return;
		}
		
		IntToLink current = firstInt;
			while (current.getNextInt().getNextInt() != null) {
				current = current.getNextInt();			
			}
			current.setNextInt(null);
		noInts--;
		return;
		
	}
}
