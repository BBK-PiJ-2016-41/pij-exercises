public class ArrayUtilities {
	// returns the first integer in the linked list of ints
	public static IntToLink listOfInts(int[] array) {
		IntToLink firstInt = new IntToLink(array[0]);
		int numInts = array.length;
		IntToLink current = firstInt;
		for (int i = 1; i < numInts; i++) {
			IntToLink intToAdd = new IntToLink(array[i]);
			current.setNextInt(intToAdd);
			current = intToAdd;
		}
		return firstInt;
	}
}