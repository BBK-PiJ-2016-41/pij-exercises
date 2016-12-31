public class PhoneLauncher {
public static void main(String[] args) {
PhoneLauncher launcher = new PhoneLauncher();
launcher.launch();
}
public void launch() {
	SmartPhone kathrynsPhone = new SmartPhone("OnePlus");
	
	System.out.println(kathrynsPhone.getBrand());
	
	kathrynsPhone.call("Mum");
	kathrynsPhone.call("Dad");
	kathrynsPhone.call("Home");
	kathrynsPhone.call("Sis");
	kathrynsPhone.call("0076536278934");
	kathrynsPhone.call("Shannon");
	kathrynsPhone.call("Shari");
	kathrynsPhone.call("Nat");
	
	kathrynsPhone.playGame("Snake");
	kathrynsPhone.browseWeb("StackOverflow");
	
	String position = kathrynsPhone.findPosition();
	System.out.println(position);
	
	kathrynsPhone.printLastNumbers();
	
}
}
