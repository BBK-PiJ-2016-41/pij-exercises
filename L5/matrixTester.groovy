Matrix myMatrix = new Matrix(5, 5);
myMatrix.prettyPrint();
println "\n"
myMatrix.setElement(4, 4, 5);
myMatrix.prettyPrint();
println "\n"
String numbers = "3,3,3,3,3";
myMatrix.setRow(3, numbers);
myMatrix.prettyPrint();
println "\n"
String colNumbers = "2,2,2,2,2";
myMatrix.setColumn(2, colNumbers);
myMatrix.prettyPrint();
println "\n"
String arrayString = myMatrix.toString();
println arrayString
println "\n"
myMatrix.setMatrix("1,2,3,4,5;6,7,8,9,10;11,12,13,14,15;16,17,18,19,20;21,22,23,24,25");
myMatrix.prettyPrint();