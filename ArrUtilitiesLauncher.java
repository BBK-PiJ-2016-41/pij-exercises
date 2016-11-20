public class ArrUtilitiesLauncher {

	public static void main (String[] args) {
	int[] myInts = {7,3,8,5,6,2,9,2};
	ArrayUtilities myArrays = new ArrayUtilities();
	IntToLink startOfList = myArrays.listOfInts(myInts);

	IntToLink current = startOfList;
	do {
		System.out.println(current.getValue());
		current = current.getNextInt();
	} while (current != null);
	
	ListUtilities myLists = new ListUtilities();
	IntToLink sortedList = 	myLists.bubblesort(startOfList);

	IntToLink newcurrent = sortedList;
	do {
		System.out.println(newcurrent.getValue());
		newcurrent = newcurrent.getNextInt();
	} while (newcurrent != null);
}
}