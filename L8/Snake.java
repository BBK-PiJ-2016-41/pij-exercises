public class Snake extends Reptile {
  public Snake() {
    super();
    this.setName("Snake");
    this.setSound("hisssssssss");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
