import org.junit.*;
import static org.junit.Assert.*;
public class PhoneTest {
  @Test
  public void testsPhone() {
    Phone phone = new OldPhone("Nokia");
    String output = phone.call("0800001066");
    String testCase = "Calling... 0800001066";
    assertEquals(testCase, output);
  }
}
