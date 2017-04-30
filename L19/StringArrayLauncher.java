import java.util.Arrays;
import java.util.Comparator;
public class StringArrayLauncher {
  public static void main(String[] args) {
    String[] strings;
    strings = new String[]{"here", "are", "a", "few", "strings", "for", "you"};
    //A lambda expression to sort in alphabetical order
    Comparator<String> lambdaCompare = (String strOne, String strTwo) -> {
      return strTwo.compareTo(strOne);
    };
    String[] result = strings;
    int length = strings.length;
    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - 1; j++) {
        if (lambdaCompare.compare(result[j], result[j + 1]) < 0) {
          String temp = result[j];
          result[j] = result[j+1];
          result[j+1] = temp;
        }
      }
    }

    for (int i = 0; i < length; i++) {
      System.out.println(result[i]);
    }

    //A lambda expression to sort in reverse alphabetical order
    Comparator<String> lambdaReverse = (String strOne, String strTwo) -> {
      return strOne.compareTo(strTwo);
    };
    String[] resultTwo = strings;
    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - 1; j++) {
        if (lambdaReverse.compare(resultTwo[j], resultTwo[j + 1]) < 0) {
          String temp = resultTwo[j];
          resultTwo[j] = resultTwo[j+1];
          resultTwo[j+1] = temp;
        }
      }
    }

    for (int i = 0; i < length; i++) {
      System.out.println(resultTwo[i]);
    }

    //A lambda expression to sort by length
    Comparator<String> lambdaLength = (String strOne, String strTwo) -> {
      return (strOne.length() < strTwo.length()) ? 1 : -1;
    };
    String[] resultThree = strings;
    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - 1; j++) {
        if (lambdaLength.compare(resultThree[j], resultThree[j + 1]) < 0) {
          String temp = resultThree[j];
          resultThree[j] = resultThree[j+1];
          resultThree[j+1] = temp;
        }
      }
    }

    for (int i = 0; i < length; i++) {
      System.out.println(resultThree[i]);
    }
  }
}
