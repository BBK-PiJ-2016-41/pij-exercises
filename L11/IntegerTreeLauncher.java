public class IntegerTreeLauncher {
  public static void main(String[] args) {
    IntegerTreeNode treeStart = new IntegerTreeNode(5);
    treeStart.add(7);
    treeStart.add(6);
    treeStart.add(9);
    treeStart.add(2);
    treeStart.add(3);
    treeStart.add(4);
    treeStart.add(1);
    treeStart.add(8);

    System.out.println(treeStart.contains(6));
    System.out.println(treeStart.contains(10));
    System.out.println(treeStart.getMax());
    System.out.println(treeStart.getMin());
    System.out.println(treeStart.toString());
    System.out.println(treeStart.depth());
  }
}
