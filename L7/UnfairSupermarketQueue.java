public class UnfairSupermarketQueue implements PersonQueue {
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
			Person returnPerson = new Person("NoOne", 0);
			do {
				if (current.getAge() > returnPerson.getAge()) {
					returnPerson = current;
				}
				current = current.getNextPerson();		
			} while (current != null);
			current = firstPerson;
			if (firstPerson.equals(returnPerson)) {
				firstPerson = firstPerson.getNextPerson();
			} else {
				do {
					current = current.getNextPerson();
				} while (!((current.getNextPerson().getPersonName()).equals(returnPerson.getPersonName())));
				current.setNextPerson(current.getNextPerson().getNextPerson());
			}
		noPeople--;
		return returnPerson;
		
	}
}
