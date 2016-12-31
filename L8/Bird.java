public class Bird extends NotMammal {
  private Flying flying;
  public Bird() {
    this.flying = new Flying();
  }
  public String getResponseType() {
		return this.flying.response();
	}
  public void reproduce() {
    super.layEggs();
  }
}
