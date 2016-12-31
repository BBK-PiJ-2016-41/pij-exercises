println "How big would you like your field of play to be? Please enter a number."
String size = System.console().readLine()
int intSize = Integer.parseInt(size)

Target myTarget = new Target(intSize);
myTarget.init()

boolean targetHit = false
Result myResult;

while (!targetHit) {
	println "Try to bring the plane down! Enter three numbers."
	println "First number:"
	String numberOne = System.console().readLine()
	int numOne = Integer.parseInt(numberOne)
	println "Second number:"
	String numberTwo = System.console().readLine()
	int numTwo = Integer.parseInt(numberTwo)
	println "Third number:"
	String numberThree = System.console().readLine()
	int numThree = Integer.parseInt(numberThree)
	myResult = myTarget.fire(numOne, numTwo, numThree)
	
	switch(myResult) {
		case Result.HIT:
			targetHit = true
			println "You hit the target! Congratulations!"
			break;
		case Result.FAIL_LEFT:
			println "You're too far to the left."
			break;
		case Result.FAIL_RIGHT:
			println "You're too far to the right."
			break;
		case Result.FAIL_HIGH:
			println "You're aiming too high."
			break;
		case Result.FAIL_LOW:
			println "You're aiming too low."
			break;
		case Result.FAIL_SHORT:
			println "Your shot fell too short."
			break;
		case Result.FAIL_LONG:
			println "Your shot fell too far away."
			break;
		case Result.OUT_OF_RANGE:
			println "Your shot was out of range."
			break;
		default:
			println "You didn't hit the target, please try again."
			break;
	}
	
}