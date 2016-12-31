public class IntegerTreeNode {
  int value;
  IntegerTreeNode left;
  IntegerTreeNode right;

  IntegerTreeNode (int number) {
    this.value = number;
    this.left = null;
    this.right = null;
  }
  public void add (int newNumber) {
    if (newNumber > this.value) {
      if (this.right == null) {
        this.right = new IntegerTreeNode(newNumber);
      } else {
        right.add(newNumber);
      }
    } else {
      if (this.left == null) {
        this.left = new IntegerTreeNode(newNumber);
      } else {
        left.add(newNumber);
      }
    }
  }
  public boolean contains(int n) {
    if (n == this.value) {
      return true;
    } else if (n > this.value) {
      if (right == null) {
        return false;
      } else {
        return right.contains(n);
      }
    } else {
      if (left == null) {
        return false;
      } else {
        return left.contains(n);
      }
    }
  }
  public int getMax() {
    if (this.right == null) {
      return this.value;
    } else {
      return right.getMax();
    }
  }
  public int getMin() {
    if (this.left == null) {
      return this.value;
    } else {
      return left.getMin();
    }
  }
  public String toString() {
    String output = "";
    output += this.value;
    if (this.left != null) {
      output += " L: " + left.toString();
    }
    if (this.right != null) {
    output += " R: " + right.toString();
    }
    return output;
  }
  public int depth() {
    int output = 0;
    if (this.left != null && this.right != null) {
      output++;
      if (left.depth() > right.depth()) {
        output += left.depth();
      } else {
        output += right.depth();
      }
    } else if (this.left != null) {
      output++;
      output += left.depth();
    } else if (this.right != null) {
      output++;
      output += right.depth();
    }
    return output;
  }
}
