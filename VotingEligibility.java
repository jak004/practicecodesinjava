
import java.util.Scanner;

public class VotingEligibility{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of people
        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();

        // Loop through each person
        for (int i = 0; i < numPeople; i++) {
            // Ask the user for the person's name and age
            System.out.print("Enter person " + (i + 1) + "'s name: ");
            String name = scanner.next();
            System.out.print("Enter " + name + "'s age: ");
            int age = scanner.nextInt();

            // Check if the person is eligible to vote
            if (age >= 18) {
                System.out.println(name + ", you're eligible to vote.");
            } else {
                System.out.println(name + ", you're ineligible to vote.");
            }
        }

        // Close the Scanner object
        scanner.close();
    }
}
