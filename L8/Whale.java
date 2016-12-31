public class Whale extends SeaMammal {
  public Whale() {
    super();
    this.setName("Whale");
    this.setSound("hhhoooooommmmm");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
