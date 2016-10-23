def ranks = ["1","2","3","4","5","6","7","8","9","10","J","Q","K"]
def suits = ["c","d","h","s"]
//////////////////////////////////////////////////////////////////////////
println "Please enter the rank of your first card"
String cardOneRank = (System.console().readLine()).toUpperCase()
while (!(ranks.contains(cardOneRank)))
{
	println "Please enter a valid card rank"
	cardOneRank = System.console().readLine()
}
int cardOneNum = 0
if (cardOneRank == "J")
{
	cardOneNum = 11
}
else if (cardOneRank == "Q")
{
	cardOneNum = 12
}
else if (cardOneRank == "K")
{
	cardOneNum = 13
}
else
{
	cardOneNum = Integer.parseInt(cardOneRank)
}

println "Please enter the suit of your first card"
String cardOneSuit = (System.console().readLine()).toLowerCase()
while (!(suits.contains(cardOneSuit)))
{
	println "Please enter a valid card suit"
	cardOneSuit = System.console().readLine()
}
String cardOne = cardOneRank + cardOneSuit
//////////////////////////////////////////////////////////////////////////
int uniqueCards = 0
String cardTwoRank = ""
String cardTwoSuit = ""
String cardTwo = ""
while (!uniqueCards)
{
	println "Please enter the rank of your second card"
	cardTwoRank = (System.console().readLine()).toUpperCase()
	while (!(ranks.contains(cardTwoRank)))
	{
		println "Please enter a valid card rank"
		cardTwoRank = System.console().readLine()
	}

	println "Please enter the suit of your second card"
	cardTwoSuit = (System.console().readLine()).toLowerCase()
	while (!(suits.contains(cardTwoSuit)))
	{
		println "Please enter a valid card suit"
		cardTwoSuit = System.console().readLine()
	}
	cardTwo = cardTwoRank + cardTwoSuit
	if (cardTwo == cardOne)
	{
		println "Please enter a unique card"
	}
	else
	{
		uniqueCards = 1
	}
}
int cardTwoNum = 0
if (cardTwoRank == "J")
{
	cardTwoNum = 11
}
else if (cardTwoRank == "Q")
{
	cardTwoNum = 12
}
else if (cardTwoRank == "K")
{
	cardTwoNum = 13
}
else
{
	cardTwoNum = Integer.parseInt(cardTwoRank)
}
//////////////////////////////////////////////////////////////////////////
uniqueCards = 0
String cardThreeRank = ""
String cardThreeSuit = ""
String cardThree = ""
while (!uniqueCards)
{
	println "Please enter the rank of your third card"
	cardThreeRank = (System.console().readLine()).toUpperCase()
	while (!(ranks.contains(cardThreeRank)))
	{
		println "Please enter a valid card rank"
		cardThreeRank = System.console().readLine()
	}

	println "Please enter the suit of your third card"
	cardThreeSuit = (System.console().readLine()).toLowerCase()
	while (!(suits.contains(cardThreeSuit)))
	{
		println "Please enter a valid card suit"
		cardThreeSuit = System.console().readLine()
	}
	cardThree = cardThreeRank + cardThreeSuit
	if (cardThree == cardTwo || cardThree == cardOne)
	{
		println "Please enter a unique card"
	}
	else
	{
		uniqueCards = 1
	}
}
int cardThreeNum = 0
if (cardThreeRank == "J")
{
	cardThreeNum = 11
}
else if (cardThreeRank == "Q")
{
	cardThreeNum = 12
}
else if (cardThreeRank == "K")
{
	cardThreeNum = 13
}
else
{
	cardThreeNum = Integer.parseInt(cardTwoRank)
}
//////////////////////////////////////////////////////////////////////////
uniqueCards = 0
String cardFourRank = ""
String cardFourSuit = ""
String cardFour = ""
while (!uniqueCards)
{
	println "Please enter the rank of your fourth card"
	cardFourRank = (System.console().readLine()).toUpperCase()
	while (!(ranks.contains(cardFourRank)))
	{
		println "Please enter a valid card rank"
		cardFourRank = System.console().readLine()
	}

	println "Please enter the suit of your fourth card"
	cardFourSuit = (System.console().readLine()).toLowerCase()
	while (!(suits.contains(cardFourSuit)))
	{
		println "Please enter a valid card suit"
		cardFourSuit = System.console().readLine()
	}
	cardFour = cardFourRank + cardFourSuit
	if (cardFour == cardThree || cardFour == cardTwo || cardFour == cardOne)
	{
		println "Please enter a unique card"
	}
	else
	{
		uniqueCards = 1
	}
}
int cardFourNum = 0
if (cardFourRank == "J")
{
	cardFourNum = 11
}
else if (cardFourRank == "Q")
{
	cardFourNum = 12
}
else if (cardFourRank == "K")
{
	cardFourNum = 13
}
else
{
	cardFourNum = Integer.parseInt(cardFourRank)
}
//////////////////////////////////////////////////////////////////////////
uniqueCards = 0
String cardFiveRank = ""
String cardFiveSuit = ""
String cardFive = ""
while (!uniqueCards)
{
	println "Please enter the rank of your fifth card"
	cardFiveRank = (System.console().readLine()).toUpperCase()
	while (!(ranks.contains(cardFiveRank)))
	{
		println "Please enter a valid card rank"
		cardFiveRank = System.console().readLine()
	}

	println "Please enter the suit of your fifth card"
	cardFiveSuit = (System.console().readLine()).toLowerCase()
	while (!(suits.contains(cardFiveSuit)))
	{
		println "Please enter a valid card suit"
		cardFiveSuit = System.console().readLine()
	}
	cardFive = cardFiveRank + cardFiveSuit
	if (cardFive == cardFour || cardFive == cardThree || cardFive == cardTwo || cardFive == cardOne)
	{
		println "Please enter a unique card"
	}
	else
	{
		uniqueCards = 1
	}
}
int cardFiveNum = 0
if (cardFiveRank == "J")
{
	cardFiveNum = 11
}
else if (cardFiveRank == "Q")
{
	cardFiveNum = 12
}
else if (cardFiveRank == "K")
{
	cardFiveNum = 13
}
else
{
	cardFiveNum = Integer.parseInt(cardFiveRank)
}
//////////////////////////////////////////////////////////////////////////
enum Hand {
	STRAIGHTFLUSH,
	POKER,
	FULLHOUSE,
	FLUSH,
	STRAIGHT,
	THREEKIND,
	TWOPAIR,
	PAIR,
	NONE,
}

Hand bestHand = Hand.NONE

int[] unsortedNums = [cardOneNum, cardTwoNum, cardThreeNum, cardFourNum, cardFiveNum]
int[] sortedNums = unsortedNums
int arrayLength = sortedNums.length

for (int i = 0; i <= arrayLength; i++)
{
	int min = i;
	for (int j = i + 1; j < arrayLength; j++)
	{
		if (sortedNums[j] < sortedNums[min])
		{
			min = j
		}

		if (sortedNums[min] < sortedNums[i])
		{
			int tmp = sortedNums[min]
			sortedNums[min] = sortedNums[i]
			sortedNums[i] = tmp
		}
	}
}
println "Sorted: " + sortedNums[0] + " "+ sortedNums[1] + " "+ sortedNums[2] + " "+ sortedNums[3] + " "+ sortedNums[4]
////////////////////////////////////////////////////////////////////////////////////////////
int flush = 0
if (cardOneSuit == cardTwoSuit && cardTwoSuit == cardThreeSuit && cardThreeSuit == cardFourSuit && cardFourSuit == cardFiveSuit)
{
	flush = 1
}

int straight = 0
if ((sortedNums[1] - sortedNums[0] == 1) && (sortedNums[2] - sortedNums[1] == 1) && (sortedNums[3] - sortedNums[2] == 1) && (sortedNums[4] - sortedNums[3] == 1))
{
	straight = 1	
}

int pairCounter = 0
int i = 1
while (i < arrayLength)
{
	if (sortedNums[i] - sortedNums[i-1] == 0)
	{
		pairCounter++
	}
	i++
}

if (straight && flush)
{
	bestHand = Hand.STRAIGHTFLUSH
}
else if (sortedNums[3] - sortedNums[0] == 0 || sortedNums[4] - sortedNums[1] == 0)
{
	bestHand = Hand.POKER
}
else if ((sortedNums[2] - sortedNums[0] == 0 && sortedNums[4] - sortedNums[3] == 0) || (sortedNums[1] - sortedNums[0] == 0 && sortedNums[4] - sortedNums[2] == 0))
{
	bestHand = Hand.FULLHOUSE
}
else if (flush)
{
	bestHand = Hand.FLUSH
}
else if (straight)
{
	bestHand = Hand.STRAIGHT
}
else if (sortedNums[2] - sortedNums[0] == 0 || sortedNums[3] - sortedNums[1] == 0 || sortedNums[4] - sortedNums[2] == 0)
{
	bestHand = Hand.THREEKIND
}
else if (pairCounter == 2)
{
	bestHand = Hand.TWOPAIR
}
else if (pairCounter == 1)
{
	bestHand = Hand.PAIR
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

switch (bestHand)
{
case Hand.STRAIGHTFLUSH:
	println "Your best hand is a straight flush!"
	break;
case Hand.POKER:
	println "Your best hand is a Poker!"
	break;
case Hand.FULLHOUSE:
	println "Your best hand is a full house!"
	break;
case Hand.FLUSH:
	println "Your best hand is a flush."
	break;
case Hand.STRAIGHT:
	println "Your best hand is a straight."
	break;
case Hand.THREEKIND:
	println "Your best hand is a three-of-a-kind."
	break;
case Hand.TWOPAIR:
	println "Your best hand is a two pair."
	break;
case Hand.PAIR:
	println "Your best hand is only a pair."
	break;
default:
	println "Your cards do not contain any scoring hands."
	break;
}
