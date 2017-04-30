public class IntThread implements Runnable {
  private SelfOrdering origin;
  private int value;

  public IntThread(int value, SelfOrdering origin) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
