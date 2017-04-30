public class MeanExceptions {
  public static void main (String[] args) {
  float sum = 0;
  for (int i = 0; i < 10; i++) {
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
