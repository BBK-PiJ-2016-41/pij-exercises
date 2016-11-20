public class Person {
	private String name;
	private int age;
	private Person nextPerson;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPerson = null; // Pointer to another person!
	}
	
	public void setNextPerson(Person newPerson) {
		this.nextPerson = newPerson;	
	}

	public String getPersonName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
	
	public Person getNextPerson() {
		return this.nextPerson;	
	}
	
}