public class Fly extends Insect {
  public Fly() {
    super();
    this.setName("Fly");
    this.setSound("bizzzzz");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
