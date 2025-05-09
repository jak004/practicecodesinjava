import java.util.Arrays;
import java.util.Scanner;

public class Genz{
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Please enter the number of numbers: ");
        int num=s1.nextInt();
        for(int i=1;i<=num;i++)
        {
            int ages[]=new int[num];
            System.out.println("Please enter your ages:  ");
            int age=s1.nextInt();
        if(age<=0){
            System.out.println("Please enter a valid age. Thank you!");

        }else if(age>0&&age<13)
            {
                System.out.println("You are a child ");
            } else if(age>=13&&age<20)
            {
                System.out.println("You are a teenage.");
            }else if (age>19&&age<=35)
            {
                System.out.println("You are a youth. ");
            }else
            {
                System.out.println("You are old. ");
            }
int[] numbers = { 4, 2, 7 };
Arrays.sort(numbers);
String result = Arrays.toString(numbers);
System.out.println(result);


        }
    }
}