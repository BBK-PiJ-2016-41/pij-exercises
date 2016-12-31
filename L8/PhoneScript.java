public class PhoneScript {
  public static void main(String[] args) {
    MobilePhone myPhone = new SmartPhone("OnePlus");
    SmartPhone phone = (SmartPhone) myPhone;
    System.out.println(phone.findPosition());
    phone.browseWeb("www.facebook.com");
    phone.call("001214774074");
    testPhone(phone);

    /* This generates an ClassCastException at run time. This is because the  method call
    * inside MobilePhone adds the number to a linked list, which is not present in Phone.
    */
    MobilePhone myMobile = new MobilePhone("Samsung");
    testPhone(myMobile);
  }

  public static void testPhone(Phone testingPhone) {
    // You can only call the methods from class Phone in here.
    testingPhone.call("12345678");
    SmartPhone testSmartPhone = (SmartPhone) testingPhone;
    // Now we can use the SmartPhone methods because we have downcasted.
    System.out.println(testSmartPhone.findPosition());
  }
}
