public class Insect extends NotMammal {
	private Flying flying;
	private Land land;
	public Insect() {
		this.flying = new Flying();
		this.land = new Land();
	}
	public String getResponseType() {
		double random = Math.random();
		int randInt = (int) Math.floor(random*11);
		if (randInt < 5) {
			return this.flying.response() + " This might change though, it is an insect!";
		} else {
			return this.land.response() + " This might change though, it is an insect!";
		}
	}
	public void reproduce() {
		super.layEggs();
	}
}
