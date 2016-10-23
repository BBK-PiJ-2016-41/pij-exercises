String number = ""
println "Please enter a number"
number = System.console().readLine()
int num = Integer.parseInt(number)
boolean prime = true
int i = 2
while (i < num)
{
	if (num % i == 0)
	{
		println "I'm sorry, your number is not prime."
		prime = false
		break;
	}
	i++
}
if (prime)
{
	println "Your number is prime!"
}