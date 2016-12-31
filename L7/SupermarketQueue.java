public class SupermarketQueue implements PersonQueue {
	private Person firstPerson = null;
	public static int noPeople = 0;
	
	// adds new int, after checking if list is empty
	public void insert(Person myPerson) {
		if (firstPerson == null) {
				firstPerson = myPerson;
				noPeople++;
				return;
			}
		myPerson.setNextPerson(firstPerson);
		firstPerson = myPerson;
		noPeople++;
	}
	
	public int getNoPeople() {
		return this.noPeople;
	}
	
	public Person retrieve() {
		if (firstPerson == null) {
			// list is empty nothing to remove
			return null;
		}
		
		if (firstPerson.getNextPerson() == null) {
			// list contains one item
			Person returnMe = firstPerson;
			firstPerson = null;
			noPeople--;
			return returnMe;
		}
		
		Person current = firstPerson;
			while (current.getNextPerson().getNextPerson() != null) {
				current = current.getNextPerson();			
			}
			Person returnPerson = current.getNextPerson();
			current.setNextPerson(null);
		noPeople--;
		return returnPerson;
		
	}
}
