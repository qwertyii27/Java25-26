// Made by Georgio
/* I have used Google and Stack Overflow for the express purposes of finding how different concepts
work. I have not copied anything, nor have I looked for this specific problem. */

import java.util.Scanner;

public class TicketProject1 {
    enum Age {
        BABY, CHILD, ADULT, SENIOR
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    enum Price {
        REGULAR, RUSH, WEEKEND
    }

    public static void main(String[] args) {
        System.out.printf("Launching ticketing system...%n-----------------------%n ");
        // enmurate age and days

        // initialize variables
        int hoursIn, minutesIn, timeMil, ageIn;
        String timeIn, timeWork, name, dayIn, studentIn;
        String studentMessage;
        final double PRICE_WEEKEND = 80.00, PRICE_RUSH = 100.00, PRICE_NORMAL = 90.00;
        final double BABY_DISCOUNT = 0.0, CHILD_DISCOUNT = 0.8, SENIOR_DISCOUNT = 0.75;
        final double STUDENT_DISCOUNT = 0.95;
        double basePrice = 0, finalPrice = 0, ageDiscount = 0, studentDiscount = 0;
        boolean student;
        Day today;
        Price price;
        Age age = null;

        // initialize scanner
        Scanner in = new Scanner(System.in);

        // get name
        System.out.print("Please enter passenger's name: ");
        name = in.nextLine();
        if (name.isEmpty()) { // check for name actually being there
            System.err.printf("%nError: You have not entered a name.%nTerminating program.%n");
            in.close();
            return;
        }

        // get day of week
        System.out.printf("Please enter the day of the week: ");
        dayIn = in.next().toLowerCase();
        if (dayIn.isEmpty()) { // check for day actually being there
            System.err.printf("%nError: You have not entered a day.%nTerminating program.%n");
            in.close();
            return;
        }
        // enum day of week
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
                System.err.printf("Error: Day input is inccorect. Please enter correctly.%nTerminating.%n");
                in.close();
                return;

        }

        // get time
        System.out.printf("Please enter the 24hr time (HH:MM): ");
        timeIn = in.next();
        if (timeIn.charAt(2) != ':' || !Character.isDigit(timeIn.charAt(0)) || !Character.isDigit(timeIn.charAt(1))
                || !Character.isDigit(timeIn.charAt(3)) || !Character.isDigit(timeIn.charAt(4))) {
            System.err.printf("Error: Please input the time in this format: \"HH:MM\"%nTerminating program.");
            in.close();
            return;
        }
        // parse time
        hoursIn = Integer.parseInt(timeIn.substring(0, 2));
        minutesIn = Integer.parseInt(timeIn.substring(3, 5));
        timeMil = Integer.parseInt(String.valueOf(hoursIn) + String.valueOf(minutesIn));
        timeWork = String.valueOf(hoursIn) + ":" + String.valueOf(minutesIn);
        if (hoursIn < 0 || hoursIn > 23 || minutesIn > 59 || minutesIn < 0) { // check for format
            System.err.printf("Error: Please input a proper time in the 24 hour format.%nTerminating Program.%n");
            in.close();
            return;
        }
        // get age
        System.out.printf("Please input the passenger's age:");
        ageIn = in.nextInt();
        if (ageIn < 0) { // silly
            System.err.printf("%nError: Unborn children cannot buy train tickets.%n");
        }
        // enum age range
        if (ageIn >= 60) {
            age = Age.SENIOR;
            ageDiscount = SENIOR_DISCOUNT;
        } else if (ageIn >= 13 && ageIn <= 59) {
            age = Age.ADULT;
            ageDiscount = 1;
        } else if (ageIn >= 3 && ageIn <= 12) {
            age = Age.CHILD;
            ageDiscount = CHILD_DISCOUNT;
        } else if (ageIn >= 0 && ageIn <= 2) {
            age = Age.BABY;
            ageDiscount = BABY_DISCOUNT;
        }
        // check for student
        System.out.printf("Are you a student? (y/n): ");
        studentIn = in.next();
        if (!studentIn.equals("n") && !studentIn.equals("y")) { // just be normal..
            System.err.printf("%nError: Please enter answer as y/n.%nTerminating program.");
            in.close();
            return;
        }
        if (studentIn.equals("n")) {
            student = false;
        } else if (studentIn.equals("y")) {
            student = true;
        }

        // enumerate base pricing
        if (today == Day.MONDAY || today == Day.TUESDAY || today == Day.WEDNESDAY || today == Day.THURSDAY
                || today == Day.FRIDAY) {
            if (timeMil >= 600 && timeMil <= 759) {
                price = Price.RUSH;
            } else if (timeMil >= 1600 && timeMil <= 1759) {
                price = Price.RUSH;
            } else {
                price = Price.REGULAR;
            }
        } else {
            price = Price.WEEKEND;
        }
        // calculate base pricing
        switch (price) {
            case RUSH:
                basePrice = PRICE_RUSH;
                break;
            case REGULAR:
                basePrice = PRICE_NORMAL;
                break;
            case WEEKEND:
                basePrice = PRICE_WEEKEND;
                break;
        }
        finalPrice = basePrice;

        // find age discounts
        switch (age) {
            case BABY:
                finalPrice = finalPrice * BABY_DISCOUNT;
                break;
            case CHILD:
                finalPrice = finalPrice * CHILD_DISCOUNT;
                break;
            case ADULT:
                break;
            case SENIOR:
                finalPrice = finalPrice * SENIOR_DISCOUNT;
                break;
        }
        // find student discount
        if (student = true) {
            finalPrice = finalPrice * STUDENT_DISCOUNT;
            studentMessage = "ACTIVE";
            studentDiscount = STUDENT_DISCOUNT;
        } else {
            studentMessage = "INACTIVE";
            studentDiscount = 0;
        }
        // final output
        System.out.printf(
                "%n---------------------------------%nName:    %-20s%nDay:     %-20s%nTime:    %-20s%n---------------------------------%n",
                name,
                today, timeWork);
        System.out.printf("Base Price:         $%11.2f (%s)%n", basePrice, price);
        System.out.printf("Age Discount:       $%11.2f (%s)%n", (basePrice * ageDiscount) - basePrice, age);
        System.out.printf("Student Discount:   $%11.2f (%s)",
                (basePrice * (ageDiscount) * studentDiscount) - (basePrice * ageDiscount),
                studentMessage);
        System.out.printf("%n---------------------------------%n");
        System.out.printf("Final price:        $%11.2f", finalPrice);
        System.out.printf("%n---------------------------------%n");

        in.close();
    }
}