public interface Book {
  /*
  private String author;
  private String title;
  public Book(String author, String title); /*{
    //sets the author and title
  }*/
  public String getAuthor(); /*{
    //returns the author name
  }*/
  public String getTitle(); /*{
    //returns the book title
  }*/
  public boolean isTaken();
  public void setTaken(boolean status);
}
