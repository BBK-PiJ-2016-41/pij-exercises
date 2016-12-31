public class TreeIntSet implements IntSet {
  private int value;
  private TreeIntSet left;
  private TreeIntSet right;

  TreeIntSet (int number) {
    this.value = number;
    this.left = null;
    this.right = null;
  }
  public void add(int newNumber) {
    if (!this.contains(newNumber)){
      if (newNumber > this.value) {
        if (this.right == null) {
          this.right = new TreeIntSet(newNumber);
        } else {
          right.add(newNumber);
        }
      } else {
        if (this.left == null) {
          this.left = new TreeIntSet(newNumber);
        } else {
          left.add(newNumber);
        }
      }
    }
  }
  public boolean contains(int n){
    if (n == this.value) {
      return true;
    } else if (n > this.value) {
      if (right == null) {
        return false;
      } else {
        return right.contains(n);
      }
    } else {
      return (left==null)?false:left.contains(n);
      /*if (left == null) {
        return false;
      } else {
        return left.contains(n);
      }*/
    }
  }
  public boolean containsVerbose(int m) {
    System.out.println(this.value);
    if (m == this.value) {
      return true;
    } else if (m > this.value) {
      return (right==null)?false:right.contains(m);
    } else {
      return (left==null)?false:left.contains(m);
    }
  }
  public String toString() {
    String output = "";
    output += this.value + ",";
    if (this.left != null) {
      output += left.toString();
    }
    if (this.right != null) {
    output += right.toString();
    }
    return output;
  }
}
