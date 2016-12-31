public class Bear extends LandMammal {
  public Bear() {
    super();
    this.setName("Bear");
    this.setSound("Grrrrr!");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
