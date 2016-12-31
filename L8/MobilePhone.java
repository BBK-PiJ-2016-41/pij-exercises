public class MobilePhone extends OldPhone {
	
	private StringPointer lastNumber;
	
	public MobilePhone(String brand) {
		super(brand);
		this.lastNumber = null;		
	}
	
	public void ringAlarm(String ringtone) {
		System.out.println("Ringing... " + ringtone);
	}
	
	public void playGame(String game) {
		System.out.println("Hope you enjoyed " + game);
	}
	
	/*
	* Here we will use the same method as OldPhone, plus adding the number to a storage list.
	*/
	@Override
	public void call(String number) {
		super.call(number);
		StringPointer numberCalled = new StringPointer(number);
		if (this.lastNumber == null) {
			lastNumber = numberCalled;
		} else {
			numberCalled.setNextString(lastNumber);
			lastNumber = numberCalled;
		}
	}
	
	/* This will print the last ten numbers called.
	*/
	public void printLastNumbers() {
		StringPointer current = lastNumber;
		int counter = 0;
		while (current != null && counter < 10) {
			System.out.println(current.getValue());
			current = current.getNextString();
		}
	}
}