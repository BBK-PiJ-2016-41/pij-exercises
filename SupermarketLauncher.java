public class SupermarketLauncher {
	public static void main (String args[]) {
		Supermarket mySupermarket = new Supermarket();
		Person personOne = new Person("Josie", 24);
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