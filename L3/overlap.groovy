class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle rectOne = new Rectangle();
Point rectOnePointOne = new Point();
Point rectOnePointTwo = new Point();
rectOne.upLeft = rectOnePointOne
rectOne.downRight = rectOnePointTwo
String strCarrier = ""
println "Please give me the x co-ordinate of your first rectangle, top left corner."
strCarrier = System.console().readLine()
rectOne.upLeft.x = Double.parseDouble(strCarrier)
println "Please give me the y co-ordinate of your first rectangle, top left corner."
strCarrier = System.console().readLine()
rectOne.upLeft.y = Double.parseDouble(strCarrier)
println "Please give me the x co-ordinate of your first rectangle, bottom right corner."
strCarrier = System.console().readLine()
rectOne.downRight.x = Double.parseDouble(strCarrier)
println "Please give me the y co-ordinate of your first rectangle, bottom right corner."
strCarrier = System.console().readLine()
rectOne.downRight.y = Double.parseDouble(strCarrier)

Rectangle rectTwo = new Rectangle();
Point rectTwoPointOne = new Point();
Point rectTwoPointTwo = new Point();
rectTwo.upLeft = rectTwoPointOne
rectTwo.downRight = rectTwoPointTwo
println "Please give me the x co-ordinate of your second rectangle, top left corner."
strCarrier = System.console().readLine()
rectTwo.upLeft.x = Double.parseDouble(strCarrier)
println "Please give me the y co-ordinate of your second rectangle, top left corner."
strCarrier = System.console().readLine()
rectTwo.upLeft.y = Double.parseDouble(strCarrier)
println "Please give me the x co-ordinate of your second rectangle, bottom right corner."
strCarrier = System.console().readLine()
rectTwo.downRight.x = Double.parseDouble(strCarrier)
println "Please give me the y co-ordinate of your second rectangle, bottom right corner."
strCarrier = System.console().readLine()
rectTwo.downRight.y = Double.parseDouble(strCarrier)

Point randomPoint = new Point();
println "Please give me the x co-ordinate of your random point."
strCarrier = System.console().readLine()
randomPoint.x = Double.parseDouble(strCarrier)
println "Please give me the y co-ordinate of your random point."
strCarrier = System.console().readLine()
randomPoint.y = Double.parseDouble(strCarrier)

boolean insideRectOne = false
boolean insideRectTwo = false

if ((randomPoint.x > rectOne.upLeft.x) && (randomPoint.x < rectOne.downRight.x) && (randomPoint.y < rectOne.upLeft.y) && (randomPoint.y > rectOne.downRight.y))
{
	insideRectOne = true
}

if ((randomPoint.x > rectTwo.upLeft.x) && (randomPoint.x < rectTwo.downRight.x) && (randomPoint.y < rectTwo.upLeft.y) && (randomPoint.y > rectTwo.downRight.y))
{
	insideRectTwo = true
}

if (insideRectOne && insideRectTwo)
{
	println "Your point is inside both rectangles."
}
else if (insideRectOne)
{
	println "Your point is inside the first rectangle only."
}
else if (insideRectTwo)
{
	println "Your point is inside the second rectangle only."
}
else
{
	println "Your point is not inside either rectangle."
}