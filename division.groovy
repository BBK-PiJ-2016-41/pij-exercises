println "Please enter a number"
String numberOne = System.console().readLine()
int numOne = Integer.parseInt(numberOne)
println "Please enter another number"
String numberTwo = System.console().readLine()
int numTwo = Integer.parseInt(numberTwo)

int counterOne = numberOne
int counterTwo = 0
while (counterOne > 0)
{
	counterOne -= numberTwo
	counterTwo++
}

int remainder = counterOne + numberOne
printLn numberOne + " divided by " + numberTwo + " is " + counterTwo + ", remainder " + remainder