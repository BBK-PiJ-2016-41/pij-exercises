public class Palindrome {
  public boolean isPalindrome(String maybePal) {
    boolean result = true;
    if (maybePal.length() == 1 || maybePal.length() == 0){
      return result;
    }

    if (maybePal.substring(0,1).equals(maybePal.substring(maybePal.length()-1, maybePal.length()))) {
      result = isPalindrome(maybePal.substring(1, maybePal.length()-1));
    } else {
      result = false;
      return result;
    }
    return result;
  }
}
