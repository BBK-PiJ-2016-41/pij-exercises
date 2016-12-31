public class Shark extends Fish {
  public Shark() {
    super();
    this.setName("Shark");
    this.setSound("......");
    this.setResponse(this.getName() + this.getResponseType());
  }
}
