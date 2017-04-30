public class Waiter implements Runnable {
//Keith's code - downloaded for learning purposes
  private int duration;
  private int id;
  private ResponsiveUserInterface origin;

  public Waiter(int id, int duration, ResponsiveUserInterface origin) {
    this.id = id;
    this.duration = duration;
    this.origin = origin;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(duration);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
      // we will just wait a little less
    }
    origin.reportFinished(id);
  }
}
