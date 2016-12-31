public class SortedDoubleLinked<T extends Comparable<T>> extends DoublyLinkedImpl<T> {

  	public SortedDoubleLinked() {
  		super();
  	}

    //Overwriting
  	public void addElement(T addMe) {
      DoubleStackNode<T> newElement = new DoubleStackNode<T>(addMe);
  		if (this.getFirstElement() == null) {
        this.setFirstElement(newElement);
      } else if (addMe.compareTo(this.getFirstElement().getValue()) < 0) {
        newElement.setNext(this.getFirstElement());
        this.getFirstElement().setPrev(newElement);
        this.setFirstElement(newElement);
      } else {
        DoubleStackNode<T> current = this.getFirstElement();
        while (current.getNext() != null && (addMe.compareTo(current.getNext().getValue()) > 0)) {
          current = current.getNext();
        }
        if (current.getNext() != null) {
          newElement.setNext(current.getNext());
          current.getNext().setPrev(newElement);
        }
        current.setNext(newElement);
        newElement.setPrev(current);
      }
      this.incrElements();
  	}
}
