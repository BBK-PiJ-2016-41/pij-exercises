ArrayChecker checkMe = new ArrayChecker();

int[] arrayOne = [1, 2, 3, 4, 5];
int[] arrayTwo = [1, 2, 5, 6, 6, 5, 2, 1];

if (!checkMe.isSymmetrical(arrayOne)) {
	int[] newArrayOne = checkMe.reverse(arrayOne)
	for (int i = 0; i < arrayOne.length; i++)
	{
		print newArrayOne[i]
	}
}

println " "

if (!checkMe.isSymmetrical(arrayTwo)) {
	int[] newArrayTwo = checkMe.reverse(arrayTwo)
	for (int i = 0; i < arrayOne.length; i++)
	{
		print newArrayTwo[i]
	}
}
