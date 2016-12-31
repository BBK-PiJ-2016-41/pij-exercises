public class Beetle extends Insect {
  public Beetle() {
    super();
    this.setName("Beetle");
    this.setSound("chirrrrrppp");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
