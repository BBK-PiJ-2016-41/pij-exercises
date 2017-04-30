public class WaiterAlive implements Runnable {

  private int duration;
  private int id;
  private ResponsiveUserInterfaceAlive origin;

  public WaiterAlive(int id, int duration, ResponsiveUserInterfaceAlive origin) {
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
