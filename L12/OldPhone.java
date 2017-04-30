public class OldPhone implements Phone {
	/**
	* Just print on the screen: "Calling <number>...".
	*/
	public String call(String number) {
		return "Calling... " + number;
	}

	private String brand = null;
	public OldPhone(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	// ... there is no setter for brand
}
