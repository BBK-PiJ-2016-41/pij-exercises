public class Lizard extends Reptile {
  public Lizard() {
    super();
    this.setName("Lizard");
    this.setSound("......");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
