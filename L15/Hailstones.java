import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Hailstones {
  private ArrayList<LinkedList<Integer>> hailstoneLists;

  public Hailstones() {
    hailstoneLists = new ArrayList<LinkedList<Integer>>(10);
    for (int i = 0; i < 10; i++) {
      hailstoneLists.add(i, null);
    }
  }
  public LinkedList<Integer> findHailstones(int start) {
    LinkedList<Integer> hailstones = new LinkedList<Integer>();
    if (start > hailstoneLists.size()) {
      hailstoneLists.ensureCapacity(start + 5);
      for (int i = start; i < start + 5; i++) {
        hailstoneLists.add(i, null);
      }
    }
    if (hailstoneLists.get(start) != null) {
      hailstones.addAll(hailstoneLists.get(start));
      return hailstones;
    }
    if (start == 1) {
      hailstones.add(start, start);
      hailstoneLists.add(start, hailstones);
      return hailstones;
    } else {
      if (start%2 == 0) {
        hailstones.addAll(findHailstones(start/2));
        hailstoneLists.add(start, hailstones);
        return hailstones;
      } else {
        hailstones.addAll(findHailstones((start*3)+1));
        hailstoneLists.add(start, hailstones);
        return hailstones;
      }
    }
  }
}
