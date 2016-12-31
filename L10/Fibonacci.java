public class Fibonacci {
  public int findNth(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    int fib = findNth(n-1) + findNth(n-2);
    return fib;
  }
}
