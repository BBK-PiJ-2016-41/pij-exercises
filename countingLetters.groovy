println "Please enter some text:"
String longText = System.console().readLine()
int textLength = longText.length()
println "Which letter would you like to count now?"
String charToFind = System.console().readLine()
def listOfChars = []

while (!(listOfChars.contains(charToFind)))
{
	int counter = 0
	for (int i = 0; i < textLength; i++)
	{
		if (longText[i] == charToFind)
		{
			counter++
		}
	}
	
	if (counter == 1)
	{
		println "There is " + counter + " in your text."
	}
	else
	{
		println "There are " + counter + " in your text."
	}
	listOfChars.push(charToFind)
	println "Which letter would you like to count now?"
	charToFind = System.console().readLine()
}
println "We're done. Thanks for playing!"