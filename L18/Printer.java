public class Printer {
  private String text;
  public Printer() {
    this.text = null;
  }
  public void print() {
    System.out.println(this.text);
  }
  public String getText() {
    String input;
    input = System.console().readLine();
    return input;
  }
  public void setText(String text) {
    this.text = text;
  }
}
