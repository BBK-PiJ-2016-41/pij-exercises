public class Comparator {
  // With improvemets from class
  public int getMax(int n, int m) {
  double nDub = (double) n;
  double mDub = (double) m;
  int max = (int) getMax(nDub, mDub);
  return max;
}
public double getMax(double d1, double d2) {
  if (d1 > d2) {
    return d1;
  } else {
    return d2;
  }
}
public String getMax(String number1, String number2) {
  int n1 = Integer.parseInt(number1);
  int n2 = Integer.parseInt(number2);
  String max = Integer.toString(getMax(n1, n2));
  return max;
}
}
