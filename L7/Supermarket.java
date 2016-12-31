public class Supermarket {
		
	private PersonQueue myQueue;

	public Supermarket() {
		this.myQueue = new SupermarketQueue();
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