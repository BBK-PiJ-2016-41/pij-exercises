public class LandMammal extends Mammal {
	private Land land;
	public LandMammal() {
		this.land = new Land();
	}
	public String getResponseType() {
		return this.land.response();
	}
	public void reproduce() {
		super.giveBirth();
	}
}
