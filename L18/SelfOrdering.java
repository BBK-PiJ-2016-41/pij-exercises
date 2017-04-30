import java.util.Arrays;
import java.util.Collections;

public class SelfOrdering {
  private Checker checker;
  private Integer[] integers;
  private boolean sorted;

  public static void main(String[] args) {
    SelfOrdering list = new SelfOrdering();
  }

  public SelfOrdering() {
    integers = new Integer[50];
    sorted = true;
    checkOrder();
  }

  public void add(Integer newInt) {
    if (this.size() > integers.length * 0.75) {
      Integer[] newArray = new Integer[integers.length * 2];
      System.arraycopy(integers, 0 , newArray, 0, this.size());
      this.integers = newArray;
    }
    integers[this.size()] = newInt;
    sorted = false;
  }

  public Integer get(int index) {
    return checker.get(index);
  }

  public Integer getThreaded(int index) {
    return integers[index];
  }

  private void checkOrder() {
    Checker check = new Checker(this);
    this.checker = check;
    Thread thr = new Thread(check);
    thr.start();
  }

  public synchronized void sort() {
    Integer temp;
    for (int i = 0; i < this.size(); i++) {
      for (int j = 1; j < this.size(); j++) {
        if (integers[j-1] > integers[j]) {
          temp = integers[j-1];
          integers[j-1] = integers[j];
          integers[j] = temp;
        }
      }
    }
    sorted = true;
    notifyAll();
  }

  private int size() {
    int counter = 0;
    int arraySize = this.integers.length;
    while (integers[counter] != null && counter < arraySize) {
      counter++;
    }
    return counter;
  }

  public boolean isSorted() {
    return sorted;
  }

  public void print() {
    System.out.println(integers.toString());
  }
}
