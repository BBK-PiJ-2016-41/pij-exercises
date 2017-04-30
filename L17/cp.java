import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class cp {
  public static void main(String[] args) {
    File file = new File(".");
    File source = new File(args[0]);
    String[] files = file.list();
    List<String> fileList = Arrays.asList(files);
    Set<String> fileSet = new HashSet<String>(fileList);
    String destFileName = args[1];
    if (fileSet.contains(destFileName)) {
      System.out.println("This file already exists. Would you like to overwrite? Y or N:");
      String answer = System.console().readLine();
      if (answer.equals("N")) {
        int dotIndex = destFileName.lastIndexOf(".");
        destFileName = destFileName.substring(0, dotIndex) + "2" + destFileName.substring(dotIndex);
      }
    }
    File dest = new File(destFileName);
    try {
      dest.createNewFile();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    BufferedReader in = null;
    PrintWriter out = null;
    try {
      in = new BufferedReader(new FileReader(source));
      String line;
      out = new PrintWriter(dest);
      while (((line = in.readLine()) != null)) {
        out.write(line + "\n");
      }
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
      System.out.println("File not found");
    } catch (IOException ex) {
      System.out.println("IO Exception");
    } finally {
      try {
        if (in != null) {
          in.close();
          out.close();
        }
      } catch (IOException ex) {
        System.out.println("File not open");
      }
    }
  }
}
