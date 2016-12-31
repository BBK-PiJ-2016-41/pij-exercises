public class Salmon extends Fish {
  public Salmon() {
    super();
    this.setName("Salmon");
    this.setSound("plop plop");
    this.setResponse(this.getName() + this.getResponseType());
  }
}
