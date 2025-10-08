/*A video club wants to reward its best members with a discount based on the member’s number of movie rentals and the number of new members referred by the member. 
The discount is in percent and is equal to the sum of the rentals and the referrals, but it cannot exceed 75 percent. 
(Hint: Math.min.) Write a program Discount_Calculator to calculate the value of the discount.

Here is a sample run:
Enter the number of movie rentals: 56
Enter the number of members referred to the video club: 3
The discount is equal to: 59.00%
 */

// Made by Georgio and Aidan.
public class Block_Buster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // declare variables
        double numCustomers;
        double numRentals;
        double discount;

        // Prompt for rentals
        System.out.print("Enter the number of movie rentals: ");
        numRentals = in.nextInt();

        System.out.print("Enter the Number of members referred to the video club: ");
        numCustomers = in.nextInt();
        // Calculations
        discount = numRentals + numCustomers;
        if (discount > 75) {
            discount = 75;
        } else {
        }
        // Final Result
        System.out.printf("The final discount is %2.0f percent!", discount);

        in.close();
    }
}
