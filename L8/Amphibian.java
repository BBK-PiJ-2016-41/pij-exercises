public class Amphibian extends NotMammal {
	private Aquatic aquatic;
	private Land land;
	public Amphibian() {
		this.aquatic = new Aquatic();
		this.land = new Land();
	}
	public String getResponseType() {
		double random = Math.random();
		int randInt = (int) Math.floor(random*11);
		if (randInt < 5) {
			return this.aquatic.response() + " This might change though, it is amphibious!";
		} else {
			return this.land.response() + " This might change though, it is amphibious!";
		}
	}
	public void reproduce() {
		super.layEggs();
	}
}
