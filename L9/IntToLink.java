public class IntToLink {
	private int value;
	private IntToLink nextInt = null;
	private IntToLink prevInt = null;
	public IntToLink(int x) {
		this.value = x;
	}
	public int getValue() {
		return this.value;
	}
	public void setNext(IntToLink nextInt) {
		this.nextInt = nextInt;
	}
	public void setPrev(IntToLink prevInt) {
		this.prevInt = prevInt;
	}
	public IntToLink getNext() {
		return this.nextInt;
	}
	public IntToLink getPrev() {
		return this.prevInt;
	}
}
