public class NotMammal extends Animal {
	public void reproduce() {
		this.layEggs();
	}
	public void layEggs() {
		System.out.println(this.getName() + " laid some eggs.");
	}
}
