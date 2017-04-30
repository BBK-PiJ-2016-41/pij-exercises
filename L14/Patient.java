import java.time.Year;
public class Patient {
  private String name;
  private int birthYear;
  public Patient() {
    System.out.println("What is the patient's name?");
    this.name = System.console().readLine();
    this.birthYear = 0;
    while (this.birthYear == 0) {
      System.out.println("What is their year of birth?");
      String yearHolder = System.console().readLine();
      try {
        int year = Integer.parseInt(yearHolder);
        Year rightNow = Year.now();
        int thisYear = rightNow.getValue();
        if (year < 0 || year < thisYear - 130) {
          throw new IllegalArgumentException("Date of birth exceeds 130 years ago.");
        } else {
          this.birthYear = year;
        }
      } catch (NumberFormatException | NullPointerException e) {
        System.out.println("Please enter a valid year.");
      } catch (IllegalArgumentException e) {
        System.out.println("Please enter a year within the last 130 years.");
      }
    }
    //System.out.println(this.birthYear);
  }
}
