public class Dog extends LandMammal {
  public Dog() {
    super();
    this.setName("Dog");
    this.setSound("Woof woof");
    this.setResponse(this.getName() + this.getResponseType());
  }
  public void changeResponse() {
    this.setResponse(this.getName() + this.getResponseType());
  }
}
