public interface Library {
  public String getLibrary();
  public int getId(String name);
  public int getMaxBooks();
  public void setMaxBooks(int max);
  public void addBook(String author, String title);
  public Book takeBook(String title);
  public void returnBook(Book book);
  public int getReaderCount();
  public int getBookCount();
  public int getBorrowedBookCount();
}
