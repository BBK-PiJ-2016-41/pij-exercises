public class Hanoi {
  public long monkify(int n) {
    if (n == 1) {
      return 1;
    }
    long moves = powerN(2, n-1) + monkify(n-1);
    return moves;
  }
  public long powerN(int x, int y){
    return (long) Math.pow(x, y);
  }
}
