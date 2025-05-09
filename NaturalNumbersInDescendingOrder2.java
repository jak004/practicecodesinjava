import java.util.Scanner;

public class NaturalNumbersInDescendingOrder2{
   
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Input the number : ");
    int num=s1.nextInt();
    System.out.println("");
    for(int i=num;i>=1;i--)
    {
        System.out.println(i);
    }

    }
}