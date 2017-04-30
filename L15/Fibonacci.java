import java.util.HashMap;

public class Fibonacci {
  public static HashMap<Integer, Integer> map = new HashMap<>();
  public int findNth(int n) {
    if (n == 1 || n == 2) {
      return 1;
    }
    int fib = findNth(n-1) + findNth(n-2);
    return fib;
  }
  public int findMemo(int n) {
    if (map.containsKey(n)) {
      return map.get(n);
    } else {
      if (n == 1 || n == 2) {
        map.put(n, 1);
        return 1;
      }
      int fib = findNth(n-1) + findNth(n-2);
      map.put(n, fib);
      return fib;
    }
  }
}
