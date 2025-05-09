import java.util.Scanner;
public class EvenOrOdd {
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number : ");
int number=scanner.nextInt();
if(number%2==1)
{
    System.out.println("The number "+number+ " is an odd number. ");
}else
{
System.out.println("The number " +number+" is an even number. ");
}
}
}
