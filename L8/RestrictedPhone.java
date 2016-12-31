public class RestrictedPhone extends SmartPhone {
	/*
	* This won't compile as you can't assign weaker privileges to an override method.
	*/
	private void playGame(String game) {
		super.playGame(game);
	}
	
	public void playIfAdult(String game, int age) {
		if (age >= 18) {
			playGame(game);
		} else {
			System.out.println("Sorry, you are not old enough.");
		}
	}
}