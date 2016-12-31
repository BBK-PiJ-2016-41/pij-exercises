public class Reptile extends NotMammal {
	private Land land;
	public Reptile() {
		this.land = new Land();
	}
	public String getResponseType() {
		return this.land.response();
	}
	public void reproduce() {
		super.layEggs();
	}
}
