String number
println "Please enter a number"
number = System.console().readLine()
int num = Integer.parseInt(number)
boolean foundPrime = true
int i = 2
while (i < num)
{
	if (num % i == 0)
	{
		foundPrime = false
		break;
	}
	i++
}
if (foundPrime)
{
	println "Your number " + number + " is prime."
}
else
{
	int j = num - 1
	int k = num + 1
	boolean primeLower = true
	boolean primeUpper = true
	while (!foundPrime)
	{
		primeLower = true
		primeUpper = true
		int counterLower = 2
		int counterUpper = 2
		while (counterLower < j && counterUpper < k)
		{
			if (j % counterLower == 0)
			{
				primeLower = false
			}
			counterLower++
			if (k % counterUpper == 0)
			{
				primeUpper = false
			}
			counterUpper++
		}
		
		if (primeLower || primeUpper)
		{
			foundPrime = true
		}
		else
		{
			j--
			k++
		}		
	}
	if ((primeLower) && (primeUpper))
	{
		println "The prime numbers " + j + " and " + k + " are equally close to your number."
	}
	else if (primeLower)
	{
		println "The closest prime number to your number is " + j
	}
	else if (primeUpper)
	{
		println "The closest prime number to your number is " + k
	}
}