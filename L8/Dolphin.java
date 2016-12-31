public class Dolphin extends SeaMammal {
  public Dolphin() {
    super();
    this.setName("Dolphin");
    this.setSound("wheeeeee");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
