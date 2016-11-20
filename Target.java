public class Target {

	private int[][][] matrix;

	public Target(int x) {
		this.matrix = new int[x][x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				for (int k = 0; k < x; k++) {
					this.matrix[i][j][k] = 0;
				}
			}
		}
	}

	public void init() {
		int bounds = this.matrix.length;
		int randomOne = (int) Math.abs(bounds * Math.random());
		int randomTwo = (int) Math.abs(bounds * Math.random());
		int randomThree = (int) Math.abs(bounds * Math.random());
		this.matrix[randomOne][randomTwo][randomThree] = 1;
	}

	public Result fire (int x, int y, int z) {
		int matrixSize = this.matrix.length;
		int hitX = 0;
		int hitY = 0;
		int hitZ = 0;
		
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				for (int k = 0; k < matrixSize; k++) {
					if (this.matrix[i][j][k] == 1) {
						hitX = i;
						hitY = j;
						hitZ = k;
					}
				}
			}
		}
		
		if (x == hitX && y == hitY && z == hitZ) {
			return Result.HIT;
		} else if (x >= matrixSize || y >= matrixSize || z >= matrixSize) {
			return Result.OUT_OF_RANGE;
		} else if (x > hitX) {
			return Result.FAIL_RIGHT;
		} else if (x < hitX) {
			return Result.FAIL_LEFT;
		} else if (x == hitX && y > hitY) {
			return Result.FAIL_HIGH;
		} else if (x == hitX && y < hitY) {
			return Result.FAIL_LOW;
		} else if (x == hitX && y == hitY && z > hitZ) {
			return Result.FAIL_LONG;
		} else if (x == hitX && y == hitY && z < hitZ) {
			return Result.FAIL_SHORT;
		}
		
		return Result.OUT_OF_RANGE;
	}

}