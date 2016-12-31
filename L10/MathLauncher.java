public class MathLauncher {
  public static void main(String[] args) {
    Factorial myFactorialCalculator = new Factorial();
    System.out.println(myFactorialCalculator.calculateFactorial(5));
    System.out.println(myFactorialCalculator.calculateFactorialIter(5));

    Fibonacci myFibonacci = new Fibonacci();
    System.out.println(myFibonacci.findNth(40));

    Hanoi myTemple = new Hanoi();
    System.out.println(myTemple.monkify(64));
  }
}
