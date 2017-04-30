public class Mammal extends Animal {
	public void reproduce() {
		this.giveBirth();
	}
	public void giveBirth() {
		System.out.println(this.getName() + " gave birth.");
	}
}
