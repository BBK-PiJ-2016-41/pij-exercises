public class IntSetLauncher {
  public static void main (String[] args) {
  TreeIntSet treeStart = new TreeIntSet(4);
  treeStart.add(3);
  treeStart.add(4);
  treeStart.add(5);
  System.out.println(treeStart.containsVerbose(6));
  System.out.println(treeStart.toString());

  ListIntSet listStart = new ListIntSet(4);
  listStart.add(3);
  listStart.add(4);
  listStart.add(5);
  System.out.println(listStart.containsVerbose(6));
  System.out.println(listStart.toString());
}
}
