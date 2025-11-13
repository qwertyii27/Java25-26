// Made by Georgio. No AI nor external assistance was used for this part of the assignment.
public class NameFix_PartA {

    public static void main(String[] args) {
        String name = "Harry";
        System.out.println("The last letter of the name is " +
        // This is an index error. name.length will always pick a length one character
        // above the final character, since the index starts at 0 but length() starts at
        // 1.
        // name.charAt(name.length()));
                name.charAt(name.length() - 1));
    }
}
