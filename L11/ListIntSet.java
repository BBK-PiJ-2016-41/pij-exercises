public class ListIntSet implements IntSet {
  private int value;
  private ListIntSet next;

  ListIntSet (int number) {
    this.value = number;
    this.next = null;
  }
  public void add(int newNumber) {
    if (!this.contains(newNumber)){
      if (this.next == null) {
        this.next = new ListIntSet(newNumber);
      } else {
        this.next.add(newNumber);
      }
    }
  }
  public boolean contains(int n){
    if (n == this.value) {
      return true;
    } else if (this.next != null) {
      return this.next.contains(n);
    } else {
      return false;
    }
  }
  public boolean containsVerbose(int m) {
    System.out.println(this.value);
    if (m == this.value) {
      return true;
    } else if (this.next != null) {
      return this.next.contains(m);
    } else {
      return false;
    }
  }
  public String toString() {
    String output = "";
    output += this.value + ",";
    if (this.next != null) {
      output += next.toString();
    }
    return output;
  }
}
