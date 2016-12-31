public class ArrayChecker {
	public boolean isSymmetrical (int[] myArray) {
		int length = myArray.length;
		int halfway = length/2;
		for (int i = 0; i < halfway; i++)
		{
			if (!(myArray[i] == myArray[length - 1 - i]))
			{
				return false;
			}
		}
		return true;
	}
	
	public int[] reverse (int[] myArray) {
		int length = myArray.length;
		int[] reversedArray;
		reversedArray = new int[length];
		for (int i = 0; i < length; i++)
		{
			reversedArray[length - 1 - i] = myArray[i];
		}
		return reversedArray;
	}
}