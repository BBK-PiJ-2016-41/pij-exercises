public class IntToLink {
	private int value;
	private IntToLink nextInt = null;

	public IntToLink(int x) {
		this.value = x;	
	}

	public int getValue() {
		return this.value;
	}
	
	public void setNextInt(IntToLink nextInt) {
		this.nextInt = nextInt;	
	}
	
	public IntToLink getNextInt() {
		return this.nextInt;	
	}

}