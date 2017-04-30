/**
  *  This is a complex type that consists of an object and a pointer to the next object. It is to be
  *  used with {@see LinkedList}.
  @author kathryn.buckley
*/

public class BookPointer {
  private Book value;
  private BookPointer nextObject;

  public BookPointer(Book objectValue) {
    this.value = objectValue;
    this.nextObject = null;
  }
  /**
  * Returns the object which is the value of the constituent.
  * @return the object value.
  */
  public Book getValue() {
    return this.value;
  }
  /**
  * Returns the object pointer which indicates the next object in the list.
  * @return the next object in the list.
  */
  public BookPointer getNext() {
    return this.nextObject;
  }
  /**
  * Sets the next object to be the object pointer supplied as a parameter.
  * @param next the ObjectPointer to the next object
  * @return void.
  */
  public void setNext(BookPointer next) {
    this.nextObject = next;
  }
}
