public class Responsive implements Runnable {
  private final String task;
  private int waitTime;
  private Printer printer;

  public Responsive(String taskNumber) {
    this.task = taskNumber;
    this.printer = new Printer();
  }
  @Override
  public void run() {
    try {
      synchronized (printer) {
        printer.setText("How long should task " + task + " take in ms?");
        printer.print();
        String duration = printer.getText();
        int durationMs = Integer.parseInt(duration);
        this.waitTime = durationMs;
        Thread.sleep(this.waitTime);
        printer.setText("Task " + this.task + " finished");
        printer.print();
      }
    } catch (InterruptedException ex) {
      //do nothing here
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      String taskNum = Integer.toString(i);
      Runnable newTask = new Responsive(taskNum);
      Thread newThread = new Thread(newTask);
      newThread.start();
    }
  }
  /*
  public class readIn implements Runnable {
    int duration;
    int iteration;
    public readIn(int n) {
      this.duration = null;
      this.iteration = n;
    }
    public void run() {
      try {
        Printer printer = new Printer("How long should task " + i + " take in ms?");
        printer.print();
        String duration = printer.getText();
        int durationMs = Integer.parseInt(duration);
        this.duration = durationMs;
      }
    }
    public int getDuration() {
      return this.duration;
    }
  }*/
}
