public class BookImpl implements Book {
  final private String author;
  final private String title;
  private boolean taken;
  public BookImpl(String author, String title) {
    this.author = author;
    this.title = title;
    this.taken = false;
  }
  public String getAuthor() {
    return this.author;
  }
  public String getTitle() {
    return this.title;
  }
  public boolean isTaken() {
    return this.taken;
  }
  public void setTaken(boolean status) {
    this.taken = status;
  }
}
