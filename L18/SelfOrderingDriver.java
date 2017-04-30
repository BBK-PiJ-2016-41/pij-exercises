public class SelfOrderingDriver {
  public static void main(String[] args) {
    SelfOrdering list = new SelfOrdering();
    list.add(20);
    list.add(30);
    list.add(10);
    list.add(90);
    list.add(75);
    System.out.println(list.get(3));
    list.print();
  }
}
