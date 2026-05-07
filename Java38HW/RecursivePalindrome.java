public class RecursivePalindrome {
  public static boolean palindromeCheck(String palindraft) {
    String palindrome = palindraft.replaceAll("[^a-zA-Z]", "").toLowerCase();
    int palinLength = palindrome.length();
    // if all letters have been checked, returns true.
    if (palinLength == 0)
      return true;
    // only continues recursion if first and last letters are equal.
    if (palindrome.charAt(0) == palindrome.charAt(palinLength - 1))
      return palindromeCheck(palindrome.substring(Math.min(palinLength, 1), Math.max(1, palinLength - 1)));
    // only triggers if palindrome hasn't been fully checked AND first and last
    // letters don't match.
    return false;
  }

  public static void main(String[] args) {
    System.out.println(palindromeCheck("kayak")); // true
    System.out.println(palindromeCheck("roor")); // true
    System.out.println(palindromeCheck("yes")); // false
  }
}
