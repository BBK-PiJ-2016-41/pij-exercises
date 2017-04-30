public class AnswerLauncher {
  public static void main (String[] args) {
    Answer myAnswer = new Answer();
    int[] tests = new int[1];
    tests[0] = 1155674;
    int[] numbers = myAnswer.answer(30, tests);
    System.out.println(numbers[0]);
  }
}
