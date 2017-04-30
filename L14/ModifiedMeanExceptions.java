public class ModifiedMeanExceptions {
  public static void main (String[] args) {
    System.out.println("How many numbers do you want to average?");
    String cap = System.console().readLine();
    int count = 0;
    while (count == 0) {
      try {
        count = Integer.parseInt(cap);
      } catch (NumberFormatException | NullPointerException e) {
        System.out.println("Please enter a real number.");
        cap = System.console().readLine();
      }
    }
    float sum = 0;
    for (int i = 0; i < count; i++) {
      System.out.println("Please enter a number.");
      String input = System.console().readLine();
      try {
        float toAdd = Float.parseFloat(input);
        sum += toAdd;
      } catch (NumberFormatException | NullPointerException e) {
        System.out.println("Please enter a real number.");
        i--;
      }
    }
    float mean = sum/10;
    System.out.println("The mean average is " + mean);
  }
}
