import java.util.ArrayList;
import java.util.List;

public class ResponsiveExample {
  private List<Integer> finished Tasks = new ArrayList<Integer>();
  private int activeTaskCount = 0;

  public static void main (String[] args) {
    ResponsiveExample ui = new ResponsiveExample();
    ui.launch();
  }
  private void launch() {
    for (int i = 0; i < 10; i++) {
      reportOnFinishedTasks();
      System.out.println("Enter the duration in ms of task " + i);
      int duration = Integer.parseInt(System.console().readLine());
      Runnable task = new Waiter(i, duration, this); //backreference to current task to enable updating of finished task list
      Thread t = new Thread(task);
      t.start();
      activeTaskCount++;
    }
    while (!allTasksFinished()) {
      waitForAWhile();
    }
    reportOnFinishedTasks();
  }
  private synchronized void waitForAWhile() {
    try {
      wait();
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  public boolean allTasksFinished() {
    return activeTaskCount == 0;
  }

  public synchronized void reportFinished(int id)

}
