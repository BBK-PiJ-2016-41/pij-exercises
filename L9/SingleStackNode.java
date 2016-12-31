public class SingleStackNode<T extends Comparable> {
	private T value;
	private SingleStackNode<T> next;
	public SingleStackNode(T myName) {
		this.value = myName;
		this.next = null;
	}
	public void setNext(SingleStackNode<T> next) {
		this.next = next;
	}
	public T getValue() {
		return this.value;
	}
	public SingleStackNode<T> getNext() {
		return this.next;
	}
}
