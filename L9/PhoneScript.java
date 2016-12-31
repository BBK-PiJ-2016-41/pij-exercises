public class PhoneScript {
  package L8;
  public static void main(String[] args) {
    Smartphone myPhone = new Smartphone("OnePlus");
    System.out.println(myPhone.findPosition());
    myPhone.browseWeb();
    myPhone.call("001214774074");
  }
}
