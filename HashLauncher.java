public class HashLauncher {
	public static void main (String args[]) {
		String str = "blank";
		while (!(str.equals("finished"))) {
			System.out.println("Give me a string and I will give the hash code.");
			str = System.console().readLine();
			int hash = str.hashCode();
			int smallHash = HashUtilities.shortHash(hash);
			System.out.println("0 < " + smallHash + " < 1000");
		}
		System.out.println("Finished.");
	}
}