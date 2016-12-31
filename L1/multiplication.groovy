println "Please enter a number."
String numberOne = System.console().readLine()
int numOne = Integer.parseInt(numberOne)
println "Please enter another number."
String numberTwo = System.console().readLine()
int numTwo = Integer.parseInt(numberTwo)
int product
for (int i = 0; i < numTwo; i++)
{
	product += numOne
}

println "The product of these numbers is " + product