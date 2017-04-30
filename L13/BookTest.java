import org.junit.*;
import static org.junit.Assert.*;
public class BookTest {
  @Test
  public void testsBook() {
    Book myBook = new BookImpl("Jane Austen", "Pride and Prejudice");
    assertEquals("Jane Austen", myBook.getAuthor());
    assertEquals("Pride and Prejudice", myBook.getTitle());
  }
  @Test
  public void testsUser() {
    User myUser = new UserImpl("Kathryn Buckley");
    assertEquals("Kathryn Buckley", myUser.getName());
    //assertEquals(1, myUser.getId());
  }
  /*
  @Test
  public void testsLibrary() {
    User myUser = new UserImpl("Kathryn Buckley");
    Library mockLibrary = new LibraryMock();
    myUser.register(mockLibrary);
    assertEquals("Library name", myUser.getLibrary());
    assertEquals(1, myUser.getId());
  }*/
  @Test
  public void testsLibraryImpl() {
    Library myLibrary = new LibraryImpl("English Faculty Library", 10);
    assertEquals("English Faculty Library", myLibrary.getLibrary());
    assertEquals(10, myLibrary.getMaxBooks());
    myLibrary.setMaxBooks(7);
    assertEquals(7, myLibrary.getMaxBooks());
  }
  @Test
  public void testsLibraryId() {
    Library myLibrary = new LibraryImpl("English Faculty Library", 10);
    User myUser = new UserImpl("Kathryn Buckley");
    myUser.register(myLibrary);
    int kbId = myUser.getId();
    User myUser1 = new UserImpl("Natalie Hilton");
    myUser1.register(myLibrary);
    int nhId = myUser1.getId();
    User myUser2 = new UserImpl("Shari De Silva");
    myUser2.register(myLibrary);
    int sdsId = myUser2.getId();
    assertEquals(0, kbId);
    assertEquals(1, nhId);
    assertEquals(2, sdsId);
    assertEquals(3, myLibrary.getReaderCount());
  }
  @Test
  public void testsBookImpl() {
    Library myLibrary = new LibraryImpl("English Faculty Library", 10);
    myLibrary.addBook("Jane Austen", "Pride and Prejudice");
    Book myBook = myLibrary.takeBook("Pride and Prejudice");
    assertTrue(myBook.isTaken());
    myLibrary.returnBook(myBook);
    assertFalse(myBook.isTaken());
    myLibrary.addBook("Jane Austen", "Sense and Sensibility");
    assertEquals(2, myLibrary.getBookCount());
    Book secondBook = myLibrary.takeBook("Pride and Prejudice");
    assertEquals(1, myLibrary.getBorrowedBookCount());
  }
}
