public class Method_Basic {
    public static void echo(String i) {
        System.out.println(i);
    }

    public static int squared(int i) {
        return i * i;
    }

    public static void main(String[] args) {
        echo("hi");
        echo(Integer.toString(squared(3)));
    }
}
