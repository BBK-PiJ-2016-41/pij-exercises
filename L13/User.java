public interface User {
  /*
  private String name;
  private int libraryId;
  */
  public String getName();
  public int getId();
  public void register(Library library);
  public String getLibrary();
}
