public class Fish extends NotMammal {
	private Aquatic aquatic;
	public Fish() {
		this.aquatic = new Aquatic();
	}
	public String getResponseType() {
		return this.aquatic.response();
	}
	public void reproduce() {
		super.layEggs();
	}
}
