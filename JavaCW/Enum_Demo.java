import java.util.Scanner;

public class Enum_Demo {
    public enum DayOfWeek {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        String dayWeek;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the day of the week (Format: Monday): ");
        dayWeek = in.next();

        DayOfWeek day;
        switch (dayWeek) {
            case "Monday":
                day = DayOfWeek.Monday;
            case "Tuesday":
                day = DayOfWeek.Tuesday;
            case "Wednesday":
                day = DayOfWeek.Wednesday;
            case "Thursday":
                day = DayOfWeek.Thursday;
            case "Friday":
                day = DayOfWeek.Friday;
            case "Saturday":
                day = DayOfWeek.Saturday;
            case "Sunday":
                day = DayOfWeek.Sunday;
        }
        System.out.println(day);
    }
}