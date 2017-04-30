import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class cat {
  public static void main(String[] args) {
    int length = args.length;
    for (int i = 0; i < length; i++) {
      File file = new File(args[i]);
      BufferedReader in = null;
      try {
        in = new BufferedReader(new FileReader(file));
        String line;
        while (((line = in.readLine()) != null)) {
          System.out.println(line);
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
}
