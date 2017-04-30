import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tr {
  public static void main(String[] args) {
    File file = new File(args[0]);
    String find = args[1];
    String replace = args[2];
    BufferedReader in = null;
    try {
      in = new BufferedReader(new FileReader(file));
      String line;
      while (((line = in.readLine()) != null)) {
        String replaceLine = line.replace(find, replace);
        System.out.println(replaceLine);
      }
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
    } catch (IOException ex) {
      System.out.println("IO Exception");
    } finally {
      try {
        if (in != null) {
          in.close();
        }
      } catch (IOException ex) {
        System.out.println("File not open");
      }
    }
  }
}
