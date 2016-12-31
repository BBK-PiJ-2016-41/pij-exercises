public class Frog extends Amphibian {
  public Frog() {
    super();
    this.setName("Frog");
    this.setSound("ribbet ribbet");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
