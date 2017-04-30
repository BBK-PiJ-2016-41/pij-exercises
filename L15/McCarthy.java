public class McCarthy {

  public static void main(String[] args) {
    int test1 = mcCarthy91(50);
    int test2 = mcCarthy91(73);
    int test3 = mcCarthy91(95);
  }

  public static int mcCarthy91(int n) {
    if (n > 100) {
      System.out.println(n - 10);
      return n - 10;
    } else {
      int p = mcCarthy91(mcCarthy91(n+11));
      System.out.println(p);
      return p;
    }
  }
}
