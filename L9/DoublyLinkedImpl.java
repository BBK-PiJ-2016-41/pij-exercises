public class DoublyLinkedImpl<T extends Comparable<T>> implements DoubleLinked<T> {
  	private DoubleStackNode<T> firstElement = null;
    private int noElements = 0;

  	public DoublyLinkedImpl() {
  		this.firstElement = null;
      this.noElements = 0;
  	}

    public DoubleStackNode<T> getFirstElement() {
      return this.firstElement;
    }

    public void setFirstElement(DoubleStackNode<T> element) {
      this.firstElement = element;
    }

  	public void addElement(T addMe) {
      DoubleStackNode<T> newElement = new DoubleStackNode<T>(addMe);
  		if (this.firstElement == null) {
        this.firstElement = newElement;
      } else {
        DoubleStackNode<T> current = firstElement;
        while (current.getNext() != null) {
          current = current.getNext();
        }
        current.setNext(newElement);
        newElement.setPrev(current);
      }
      this.noElements++;
  	}

    public boolean removeElement(T removeMe) {
      if (this.firstElement == null) {
        return false;
      }

      if (firstElement.getValue().equals(removeMe)) {
        (firstElement.getNext()).setPrev(null);
        firstElement = firstElement.getNext();
        noElements--;
        return true;
      }

      DoubleStackNode<T> current = firstElement;
      do {
        current = current.getNext();
        if((current.getValue()).equals(removeMe)) {
          if (current.getNext() != null) {
            (current.getNext()).setPrev(current.getPrev());
            (current.getPrev()).setNext(current.getNext());
          } else { current.getPrev().setNext(null); }
            noElements--;
            return true;
        }
      } while (current.getNext() != null);
      return false;
    }

    public void incrElements() {
      noElements++;
    }

    public int getNoElements() {
      return this.noElements;
    }

    public void checkList() {
      DoubleStackNode<T> current = firstElement;
      do {
        System.out.println(current.getValue());
        current = current.getNext();
      } while (current != null);
    }
}
