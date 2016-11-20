class Point {
	double x;
	double y;
	
	double distanceTo(Point point) {
		double xDistance = point.x - this.x
		double yDistance = point.y - this.y
		double distance = Math.sqrt((yDistance * yDistance) + (xDistance * xDistance))
		return distance
	}
	
	double distanceToOrigin() {
		Point origin = new Point();
		origin.x = 0
		origin.y = 0
		double distance = distanceTo(origin)
		return distance
	}

	void moveTo (double x, double y) {
		this.x = x
		this.y = y
	}

	void moveTo (Point point) {
		this.x = point.x
		this.y = point.y
	}

	Point clone () {
		Point clone = new Point();
		clone.x = this.x
		clone.y = this.y
		return clone
	}

	Point opposite () {
		Point opposite = new Point();
		opposite.x = (this.x) * -1
		opposite.y = (this.y) * -1
		return opposite
	}
}

Point testPoint = new Point();
testPoint.x = 2
testPoint.y = 5

Point otherTest = new Point();
otherTest.x = 5
otherTest.y = 9

println testPoint.distanceTo(otherTest)
println testPoint.distanceToOrigin()

Point clone = testPoint.clone()
println clone.x
println clone.y

Point opposite = testPoint.opposite()
println opposite.x
println opposite.y

testPoint.moveTo(otherTest)
println testPoint.x
println testPoint.y