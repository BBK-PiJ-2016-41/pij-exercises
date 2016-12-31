public class SmartPhone extends MobilePhone {
	
	public SmartPhone (String brand) {
		super(brand);
	}
	
	public void browseWeb(String website) {
		System.out.println("Browsing.... " + website);
	}
	
	public String findPosition() {
		double northSouth = Math.random();
		double eastWest = Math.random();	
		int nSCoOrd = (int) Math.floor(northSouth * 181);
		int eWCoOrd = (int) Math.floor(eastWest * 181);
		String returnMe = "";
		if (nSCoOrd >= 90) {
			returnMe += (nSCoOrd - 90) + "\u00b0" + " N";
		} else {
			returnMe += (nSCoOrd - 90) + "\u00b0" + " S";
		}
		
		returnMe += ", ";
		
		if (eWCoOrd >= 90) {
			returnMe += (eWCoOrd - 90) + "\u00b0" + " W";
		} else {
			returnMe += (eWCoOrd - 90) + "\u00b0" + " E";
		}
		return returnMe;
	}
	
	public void call(String number) {
		if (number.substring(0,2).equals("00")) {
			System.out.println("Calling " + number + " through the internet to save money");
			super.call(number);
		} else {
			super.call(number);
		}
	}
}