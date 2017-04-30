import java.util.HashMap;

public class DoggyMethod {
  public static HashMap<Integer, String> intMap = new HashMap<>();
  String doggyMethod(int n) {
    if (intMap.containsKey(n)) {
      return intMap.get(n);
    } else {
      if (n <= 0) {
        return "";
      }
      String result = doggyMethod(n-3) + n + doggyMethod(n-2);
      return result;
    }
    /*
    Old code
    String result = doggyMethod(n-3) + n + doggyMethod(n-2);
    if (n <= 0) {
    return "";
    }
    return result;
  }
  */
}
}
