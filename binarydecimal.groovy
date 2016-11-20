int power(int b, int e) {
	if (e == 0)
	{
		return 1
	}
	else
	{
		int power = b
		for (int i = 1; i < e; i++)
		{
			power = power * b
		}
		return power
	}
}

int power2(int e) {
	int twoToPower = power(2, e)
	return twoToPower
}

int binary2decimal(String binary) {
	int decimal = 0
	int length = binary.length()
	for (int i = 0; i < length; i++)
	{
		int binaryInt = Integer.parseInt(binary[i])
		int increment = binaryInt * (power2(length - 1 - i))
		decimal += increment
	}
	return decimal
}

String decimal2binary (int decimal) {
	int originalDecimal = decimal
	String newBinary = ""
	while (originalDecimal > 0)
	{
		int nextNumber = 0
		if (originalDecimal == 1)
		{
			nextNumber = 1
		}
		else
		{
			nextNumber = originalDecimal % 2
		}

		newBinary = nextNumber.toString() + newBinary

		if (nextNumber == 0)
		{
			originalDecimal = originalDecimal/2
		}
		else
		{
			originalDecimal = (originalDecimal - 1)/2
		}
	}
	return newBinary
}

println "What would you like to do? Enter 1 for decimal to binary, enter 2 for binary to decimal."
String choice = System.console().readLine()
println "Please enter your number"
String number = System.console().readLine()
switch (choice) {
	case "1": println decimal2binary(Integer.parseInt(number))
	break;
	case "2": println (binary2decimal(number)).toString()
	break;
	default: println "Choice not recognised."
}