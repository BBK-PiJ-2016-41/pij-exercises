import java.io.File;

public class mkdir {
  public static void main(String[] args) {
    File file = new File(args[0]);
    file.mkdir();
  }
}
