import java.util.Scanner;

public class NaturalNumbersInDescendingOrder1{
   
    public static void main(String[]args){
        Scanner s1=new Scanner(System.in);
        System.out.println("Input the number : ");
    int num=s1.nextInt();
    System.out.println("");
int i=num;
while(i>=1)
{
    System.out.println(i);
    i--;
}
System.out.println("");
    }
}