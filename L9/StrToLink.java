public class StrToLink {
	private String name;
	private StrToLink nextStr;
  private StrToLink prevStr;

	public StrToLink (String name) {
		this.name = name;
		this.nextStr = null;
    this.prevStr = null;
	}

	public void setNext(StrToLink newStr) {
		this.nextStr = newStr;
	}

  public void setPrev(StrToLink newStr) {
   this.prevStr = newStr;
  }

	public String getValue() {
		return this.name;
	}
	public StrToLink getNext() {
		return this.nextStr;
	}
  public StrToLink getPrev() {
    return this.prevStr;
  }

}
