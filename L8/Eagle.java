public class Eagle extends Bird {
  public Eagle() {
    super();
    this.setName("Eagle");
    this.setSound("cark");
    this.setResponse(this.getName() + this.getResponseType());
  }
}
