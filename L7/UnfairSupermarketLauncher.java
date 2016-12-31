public class UnfairSupermarketLauncher {
	public static void main (String args[]) {
		UnfairSupermarket mySupermarket = new UnfairSupermarket();
		Person personOne = new Person("Josie", 89);
		Person personTwo = new Person("Shannon", 27);
		Person personThree = new Person ("Michael", 45);
		Person personFour = new Person ("Jeeves", 67);

		mySupermarket.addPerson(personOne);
		mySupermarket.addPerson(personTwo);
		mySupermarket.addPerson(personThree);
		mySupermarket.addPerson(personFour);

		Person personServed = mySupermarket.servePerson();
		System.out.println(personServed.getPersonName());

		Person nextServed = mySupermarket.servePerson();
		System.out.println(nextServed.getPersonName());
	}

}