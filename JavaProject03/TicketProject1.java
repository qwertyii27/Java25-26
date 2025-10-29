// Made by Georgio
/* I have used Google and Stack Overflow for the express purposes of finding how different concepts
work. I have not copied anything, nor have I looked for this specific problem. */

import java.util.Scanner;

public class TicketProject1 {
    public static void main(String[] args) {
        System.out.printf("Launching ticketing system...%n-----------------------%n ");
        // enmurate age and days
        enum Age {
            BABY, CHILD, ADULT, SENIOR
        }
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        // initialize variables
        int hoursIn, minutesIn, timeMil, ageIn;
        String timeIn, timeWork, name, dayIn, studentIn;
        final double PRICE_WEEKEND = 80.00, PRICE_RUSH = 90.00, PRICE_NORMAL = 100.00;
        final double BABY_DISCOUNT = 0.0, CHILD_DISCOUNT = 0.8, SENIOR_DISCOUNT = 0.75;
        double finalPrice;
        boolean student;
        Day today;
        Age age;

        // initialize scanner
        Scanner in = new Scanner(System.in);

        // get name
        System.out.print("Please enter passenger's name: ");
        name = in.nextLine();
        if (name.isEmpty()) { // check for name actually being there
            System.err.printf("%nError: You have not entered a name.%nTerminating program.%n");
            return;
        }

        // get day of week
        System.out.printf("%nPlease enter the day of the week: ");
        dayIn = in.next().toLowerCase();
        if (dayIn.isEmpty()) { // check for day actually being there
            System.err.printf("%nError: You have not entered a day.%nTerminating program.%n");
            return;
        }
        switch (dayIn) {
            case "mon":
            case "monday":
                today = Day.MONDAY;
                break;
            case "tue":
            case "tus":
            case "tuesday":
                today = Day.TUESDAY;
                break;
            case "wed":
            case "wednesday":
            case "wensday":
                today = Day.WEDNESDAY;
                break;
            case "thu":
            case "thursday":
                today = Day.THURSDAY;
                break;
            case "fri":
            case "friday":
                today = Day.FRIDAY;
                break;
            case "sat":
            case "saturday":
                today = Day.SATURDAY;
                break;
            case "sun":
            case "sunday":
                today = Day.SUNDAY;
                break;
            default:
                System.err.printf("%nError: Day input is inccorect. Please enter correctly.%nTerminating.%n");
                return;

        }

        // get time
        System.out.printf("%nPlease enter the 24hr time (HH:MM): ");
        timeIn = in.next();
        if (!timeIn.contains(":")) {
            System.err.printf("Error: Please input the time in this format: \"HH:MM\"");
            return;
        }
        hoursIn = Integer.parseInt(timeIn.substring(0, 2));
        minutesIn = Integer.parseInt(timeIn.substring(3, 5));
        if (hoursIn < 0 || hoursIn > 23 || minutesIn > 59 || minutesIn < 0) {
            System.err.printf("Error: Please input a proper time in the 24 hour format.%nTerminating Program.%n");
            return;
        }
        // get age
        System.out.printf("%nPlease input the passenger's age:");
        ageIn = in.nextInt();
        if (ageIn < 0) {
            System.err.printf("%nError: Unborn children cannot buy train tickets.%n");
        }
        if (ageIn >= 60) {
            age = Age.SENIOR;
        } else if (ageIn >= 13 && ageIn <= 59) {
            age = Age.ADULT;
        } else if (ageIn >= 3 && ageIn <= 12) {
            age = Age.CHILD;
        } else if (ageIn >= 0 && ageIn <= 2) {
            age = Age.BABY;
        }
        System.out.printf("%nAre you a student? (y/n): ");
        studentIn = in.next();
        if (!studentIn.equals("n") || !studentIn.equals("y")) {
            System.err.printf("%nError: Please enter answer as y/n.%nTerminating program.");
            in.close();
            return;
        }
        if (studentIn.equals("n")) {
            student = false;
        } else if (studentIn.equals("y")) {
            student = true;
        }

        // find base pricing
        if (today == Day.MONDAY || today == Day.TUESDAY || today == Day.WEDNESDAY || today == Day.MONDAY
                || today == Day.MONDAY) {

        }

    }
}