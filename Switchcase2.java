import java.util.Scanner;

public class Switchcase2 {
public static void main(String[] args)
 {
Scanner s1=new Scanner(System.in);
System.out.println(" Question 1: Which of these is an artificial thing? \n1. Car \n2.Human being \n3.Trees \n4.Birds");    
int choice=s1.nextInt();

switch (choice) {
    case 1:
    System.out.println("True");
        
        break;
        case 2:
        System.out.println("Wrong");
        break;
        case 3:
        System.out.println("Wrong");
        break;
        case 4:
        System.out.println("Wrong");

    default:
    System.out.println("Enter correct choice");
    break;
}   
}
}