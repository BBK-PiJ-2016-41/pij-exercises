public class StringPointer {
	private String value;
	private StringPointer nextString = null;

	public StringPointer(String string) {
		this.value = string;
	}

	public void setNextString(StringPointer next) {
		this.nextString = next;
	}

	public StringPointer getNextString() {
		return this.nextString;
	}

	public String getValue() {
		return this.value;
	}

}