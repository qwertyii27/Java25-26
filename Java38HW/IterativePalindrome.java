public class IterativePalindrome {
  public static boolean palinCheck(String palindraft) {
    String palindrome = palindraft.replaceAll("[^a-zA-Z]", "").toLowerCase();
    int palinLength = palindrome.length();
    for (int i = 0; i < palinLength / 2; i++)
      if (palindrome.charAt(i) != palindrome.charAt(palinLength - 1 - i))
        return false;
    return true;
  }

  public static void main(String[] args) {
    System.out.println(palinCheck("hi")); // false
    System.out.println(palinCheck("hia")); // false
    System.out.println(palinCheck("kayak")); // true
    System.out.println(palinCheck("heeh")); // true
  }
}
