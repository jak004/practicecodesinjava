 
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = s1.nextLine();

        System.out.print("Enter your middle name (press Enter to skip): ");
        String middleName = s1.nextLine().trim();

        System.out.print("Enter your surname: ");
        String surname = s1.nextLine();

        String fullName = getFullName(firstName, middleName, surname);

        System.out.println("My name is " + fullName);
    }

    public static String getFullName(String firstName, String middleName, String surname) {
        if (middleName.isEmpty()) {
            return firstName + " " + surname;
        } else {
            return firstName + " " + middleName + " " + surname;
        }
    }
}
