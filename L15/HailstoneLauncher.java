public class HailstoneLauncher {
  public static void main (String[] args) {
    Hailstones hailstone = new Hailstones();
    System.out.println(hailstone.findHailstones(6).toArray().toString());
    System.out.println(hailstone.findHailstones(7).toArray().toString());
  }
}
