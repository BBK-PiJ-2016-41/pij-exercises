public class Factorial {
  public int calculateFactorial(int n) {
    if (n == 1) {
      return n;
    }
    int factorial = n*calculateFactorial(n-1);
    return factorial;
  }

  public int calculateFactorialIter(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++){
      factorial = factorial * i;
    }
    return factorial;
  }
}
