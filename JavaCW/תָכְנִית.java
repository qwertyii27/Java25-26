import java.util.Scanner;

public class תָכְנִית {
  static Scanner סוֹרֵק = new Scanner(System.in);

  public static void הֶדפֵּסI(String קֶלֶט) {
    System.out.println(קֶלֶט);
  }

  public static void לוּלָאָה(int לוּלָאָה) {
  }

  public static int עשרים_ושלוש() {
    return 23;
  }

  public static String הַבָּא(Scanner סוֹרֵק) {
    return סוֹרֵק.next();

  }

  final static int חִשׁוּב = עשרים_ושלוש();

  public static void main(String[] args) {
    String תְגוּבָה;
    הֶדפֵּסI("שלום! מה שלומך?");
    תְגוּבָה = הַבָּא(סוֹרֵק);
    הֶדפֵּסI(תְגוּבָה + "? מה" + חִשׁוּב + "!");
  }
}
