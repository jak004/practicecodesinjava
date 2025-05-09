import java.util.Scanner;

public class GradingSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input scores and fee payment status
        System.out.print("Enter your exam score: ");
        int examScore = scanner.nextInt();
        System.out.print("Enter your assessment score: ");
        int assessmentScore = scanner.nextInt();
        System.out.print("Has the student paid the fees in full? (true/false): ");
        boolean feesPaid = scanner.nextBoolean();

        // Check requirements
        boolean passExam = examScore >= 25;
        boolean passAssessment = assessmentScore >= 15;
        int totalScore = examScore + assessmentScore;
        boolean isCondoned = totalScore == 39 && (examScore == 25 && assessmentScore == 14 || examScore == 24 && assessmentScore == 15);

        // Determine if the student passed or failed
        if ((passExam && passAssessment) || isCondoned) {
            if (feesPaid) {
                System.out.println("Certificate issued.");
            } else {
                System.out.println("Requirements met but fees not paid. No certificate issued.");
            }
        } else {
            System.out.println("Student failed.");

        // Inform which components were passed/failed
        if (!passExam) {
            System.out.println("Failed exam component.");
        }
        if (!passAssessment) {
            System.out.println("Failed assessment component.");
        }

        // Check if student needs to repeat
        if (!passExam || !passAssessment) {
            System.out.println("Student must repeat the failed components.");
        }

        if (totalScore>=70){
            System.out.println("Your grade is A");
        } 
        else if (totalScore>=60){
            System.out.println("Your grade is B");
        }
        else if (totalScore>=50){
            System.out.println("Your grade is C");
        }
        else if (totalScore>=40){
            System.out.println("Your grade is D");
        }else
        {
            System.out.println("Your grade is F");
        }

        scanner.close();
    }
}
}