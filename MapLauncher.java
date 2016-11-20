public class MapLauncher {
	public static void main(String[] args) {
		String str = "blank";
		SimpleMap myMap = new SimpleMapImpl();
		boolean empty = myMap.isEmpty();
		System.out.println(empty);
		int[] hashes = new int[10];
		int counter = 0;
		while (!(str.equals("finished"))) {
			System.out.println("Give me a string and I will enter it into the hash table.");
			str = System.console().readLine();
			int hash = str.hashCode();
			int smallHash = HashUtilities.shortHash(hash);
			myMap.put(smallHash, str);
			hashes[counter] = smallHash;
			counter++;
		}
		System.out.println("Finished.");
		
	
	for (int i = 0; i < 10; i++) {
		String[] test = myMap.get(hashes[i]);
		System.out.println(test[0]);
	}
	
	System.out.println("Would you like to remove a string?");
	str = System.console().readLine();
	int testHash = str.hashCode();
	int testSmallHash = HashUtilities.shortHash(testHash);
	myMap.remove(testSmallHash, str);

	}
	
}