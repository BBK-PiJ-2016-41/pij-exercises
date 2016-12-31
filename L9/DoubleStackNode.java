public class DoubleStackNode<T extends Comparable<T>> {
	private T value;
	private DoubleStackNode<T> next;
  private DoubleStackNode<T> prev;
	public DoubleStackNode(T myName) {
		this.value = myName;
		this.next = null;
    this.prev = null;
	}
	public void setNext(DoubleStackNode<T> next) {
		this.next = next;
	}
  public void setPrev(DoubleStackNode<T> prev) {
   this.prev = prev;
  }
	public T getValue() {
		return this.value;
	}
	public DoubleStackNode<T> getNext() {
		return this.next;
	}
  public DoubleStackNode<T> getPrev() {
    return this.prev;
  }

}
