public class Crocodile extends Reptile {
  public Crocodile() {
    super();
    this.setName("Crocodile");
    this.setSound("grrraarghhhhhhh");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
