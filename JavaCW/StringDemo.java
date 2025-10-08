public class StringDemo {
    public static void main(String[] args) {
        String name = "Georgio";
        System.out.printf("Your name is %s %n", name);
        System.out.printf("Your name is %s %n", name.toUpperCase());
        System.out.printf("Your name is %s %n", name.toLowerCase());

        int length = name.length();
        System.out.println("Length = " + length);
        System.out.println("First letter = " + name.charAt(0));
        System.out.println("Last letter = " + name.charAt(length - 1));
    }
}