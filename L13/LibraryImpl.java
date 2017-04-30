public class LibraryImpl implements Library {
  private String libraryName;
  private int maxBooks;
  private LinkedList users;
  private BookList books;

  public LibraryImpl(String name, int maxBooks) {
    this.libraryName = name;
    this.maxBooks = maxBooks;
    this.users = new LinkedList();
    this.books = new BookList();
  }
  public String getLibrary() {
    return this.libraryName;
  }
  public int getId(String name) {
    int id = this.users.findUserId(name);
    if (id == -1) {
      id = users.size();
      users.add(name);
    }
    return id;
  }
  public int getMaxBooks() {
    return this.maxBooks;
  }
  public void setMaxBooks(int max) {
    this.maxBooks = max;
  }
  public void addBook(String author, String title) {
    Book bookToAdd = new BookImpl(author, title);
    books.add(bookToAdd);
  }
  public Book takeBook(String title) {
    Book book = books.findBook(title);
    if (book != null) {
      book.setTaken(true);
    }
    return book;
  }
  public void returnBook(Book book) {
    book.setTaken(false);
  }
  public int getReaderCount() {
    return this.users.size();
  }
  public int getBookCount() {
    return this.books.size();
  }
  public int getBorrowedBookCount() {
    return this.books.borrowedSize();
  }
}
