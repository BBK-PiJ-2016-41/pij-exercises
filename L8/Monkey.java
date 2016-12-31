public class Monkey extends LandMammal {
  public Monkey() {
    super();
    this.setName("Monkey");
    this.setSound("ooh ooh ah ah!");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
