public class UserImpl implements User {
  private String name;
  private int libraryId;
  private Library library;

  public UserImpl(String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
  public int getId() {
    return this.libraryId;
  }
  public void register(Library library) {
    this.library = library;
    this.libraryId = library.getId(this.name);
  }
  public String getLibrary() {
    return this.library.getLibrary();
  }
}
