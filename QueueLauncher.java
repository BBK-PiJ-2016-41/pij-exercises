public class QueueLauncher {

	public static void main(String args[]) {
	Queue myQueue = new Queue();
	IntToLink intOne = new IntToLink(4);
	IntToLink intTwo = new IntToLink(7);
	IntToLink intThree = new IntToLink(14);
	myQueue.insert(intOne);
	myQueue.insert(intTwo);
	myQueue.insert(intThree);
	myQueue.retrieve();

	System.out.println("There are " + myQueue.getNoInts() + " requests");
	}
}