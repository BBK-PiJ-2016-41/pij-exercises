public class Matrix {
	private int[][] twoDArray;
	
	public Matrix(int x, int y) {
		this.twoDArray = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				this.twoDArray[i][j] = 1;
			}
		}
	}
	
	public void setElement(int x, int y, int z) {
		int length = this.twoDArray.length;
		int width = (this.twoDArray[0]).length;
		if (x < length && y < width) {
			this.twoDArray[x][y] = z;
		}
	}

	public void setRow(int x, String numbers) {
		int length = this.twoDArray.length;
		if (x < length) {
			String[] chars = numbers.split(",");
			int charLength = chars.length;
			int[] numberArray = new int[charLength];
			int counter = 0;
			for (int i = 0; i < charLength; i++) {
				try {
					numberArray[i] = Integer.parseInt(chars[i]);
					counter++;
				} catch (NumberFormatException e) {
					break;
				}
			}
			if (numberArray.length == counter && charLength == (this.twoDArray[x]).length) {
				for (int j = 0; j < charLength; j++) {
					this.twoDArray[x][j] = numberArray[j];
				}
			}
		}
	}
	
	public void setColumn(int x, String numbers) {
		int columnLength = (this.twoDArray[0]).length;
		if (x < columnLength) {
			String[] chars = numbers.split(",");
			int charLength = chars.length;
			int[] numberArray = new int[charLength];
			int counter = 0;
			for (int i = 0; i < charLength; i++) {
				try {
					numberArray[i] = Integer.parseInt(chars[i]);
					counter++;
				} catch (NumberFormatException e) {
					break;
				}
			}
			if (numberArray.length == counter && charLength == (this.twoDArray[x].length)) {
				for (int j = 0; j < charLength; j++) {
					this.twoDArray[j][x] = numberArray[j];
				}
			}
			
		}
	}

	public void setMatrix(String numbers) {
		String[] numberSets = numbers.split(";");
		int numberOfSets = numberSets.length;
		if (numberOfSets == this.twoDArray.length) {
			for (int i = 0; i < numberOfSets; i++) {
				String[] chars = (numberSets[i]).split(",");
				for (int j = 0; j < chars.length; j++) {
					this.twoDArray[i][j] = Integer.parseInt(chars[j]);
				}
			}
		}
	}
	
	public String toString() {
		String output = "[";
		int arrayLength = this.twoDArray.length;
		int arrayWidth = (this.twoDArray[0]).length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < arrayWidth; j++) {
				output += Integer.toString(this.twoDArray[i][j]);
				if (j < arrayWidth - 1) {
					output += ",";
				}
				else {
					output += ";";
				}
			}
		}
		output += "]";
		return output;
	}

	public void prettyPrint() {
		int arrayLength = this.twoDArray.length;
		int arrayWidth = (this.twoDArray[0]).length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < arrayWidth; j++) {
				System.out.print(twoDArray[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}