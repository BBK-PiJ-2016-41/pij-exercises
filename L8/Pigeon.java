public class Pigeon extends Bird {
  public Pigeon() {
    super();
    this.setName("Pigeon");
    this.setSound("peep peep");
    this.setResponse(this.getName() + this.getResponseType());
  }
}
