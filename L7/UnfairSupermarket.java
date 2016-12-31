public class UnfairSupermarket {
		
	private PersonQueue myQueue;

	public UnfairSupermarket() {
		this.myQueue = new UnfairSupermarketQueue();
	}
		
	public void addPerson(Person person) {
		myQueue.insert(person);
		return;
		
	}

	public Person servePerson() {
		Person personServed = myQueue.retrieve();
		return personServed;
	}
		
}