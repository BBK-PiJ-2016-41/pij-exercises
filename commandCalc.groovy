println "Please enter a mathematical operation with two operands."
String operation = System.console().readLine()
String[] operationArray
String operationSign
Double operandOne = null
Double operandTwo = null
if (operation.contains(" "))
{
	operationArray = operation.split("\\s+")
}
else if (operation.contains("+"))
{
	operationArray = operation.split("\\+")
	operationSign = "+"
}
else if (operation.contains("-"))
{
	operationArray = operation.split("\\-")
	operationSign = "-"
}
else if (operation.contains("/"))
{
	operationArray = operation.split("/")
	operationSign = "/"
}
else if (operation.contains("*"))
{
	operationArray = operation.split("\\*")
	operationSign = "*"
}
else
{
	println "Operation not recognised."
}
int operationLength = operationArray.length
for (int i = 0; i < operationLength; i++)
{
	try
	{
		Double numberCarrier = Double.parseDouble(operationArray[i])
		if (operandOne == null)
		{
			operandOne = numberCarrier
		}
		else
		{
			operandTwo = numberCarrier
		}
	}
	catch (NumberFormatException nfe)
	{
		String charCarrier = operationArray[i]
		if (charCarrier != " ")
		{
			operationSign = charCarrier
		}
	}	
}
Double answer
switch (operationSign)
{
case "+":
	answer = operandOne + operandTwo
	println operandOne + " + " + operandTwo + " = " + answer
	break;
case "-":
	answer = operandOne - operandTwo
	println operandOne + " - " + operandTwo + " = " + answer
	break;
case "*":
	answer = operandOne * operandTwo
	println operandOne + " * " + operandTwo + " = " + answer
	break;
case "/":
	answer = operandOne / operandTwo
	println operandOne + " / " + operandTwo + " = " + answer
	break;
default:
	println "Operation not recognised."
	break;
}
