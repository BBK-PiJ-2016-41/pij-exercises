import java.io.File;

public class ls {
  public static void main (String[] args) {
    File file = new File(".");
    String[] files = file.list();
    int length = files.length;
    for (int i = 0; i < length; i++) {
      System.out.println(files[i]);
    }
  }
}
