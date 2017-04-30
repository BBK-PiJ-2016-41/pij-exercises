
public class FibLauncher {
  public static void main (String[] args) {
    Fibonacci myFib = new Fibonacci();
    long start = System.nanoTime();
    myFib.findNth(40);
    long timer = System.nanoTime() - start;
    System.out.println("Method took: " + Long.toString(timer));
    long start2 = System.nanoTime();
    myFib.findMemo(40);
    long timer2 = System.nanoTime() - start2;
    System.out.println("Method took: " + Long.toString(timer2));
    long start3 = System.nanoTime();
    myFib.findNth(45);
    long timer3 = System.nanoTime() - start3;
    System.out.println("Method took: " + Long.toString(timer3));
    long start4 = System.nanoTime();
    myFib.findMemo(45);
    long timer4 = System.nanoTime() - start4;
    System.out.println("Method took: " + Long.toString(timer4));
  }
}
