import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
public class AnimalTest {
  @Test
  public void testsAnimal() {
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    Animal cat = new Cat();
    cat.reproduce();
    assertEquals("Cat gave birth.\r\n", outContent.toString());
  }
}
