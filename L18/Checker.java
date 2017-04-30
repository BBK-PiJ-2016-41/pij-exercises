public class Checker implements Runnable {
  private SelfOrdering origin;

  public Checker(SelfOrdering origin) {
    this.origin = origin;
  }

  @Override
  public void run() {
    while (true) {
      if (origin.isSorted()) {
        try {
          Thread.sleep(500);
        } catch (InterruptedException ex) {
          //do nothing
        }
      } else {
        origin.sort();
      }
    }
  }

  public synchronized int get(int index) {
    while (!origin.isSorted()) {
      try {
        wait();
      } catch (InterruptedException ex) {
        //do nothing
      }
    }
    return origin.getThreaded(index);
  }
}
