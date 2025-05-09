import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int num=s2.nextInt();
        if (num<0)
        {
            System.out.println("The factorial cannot be found. ");
        }else{
            int fact=1;
            for(int i=num;i>1;i--)
            {
                fact=fact*i;   
            }
System.out.println("The factorial of "+num+" is "+fact);
        }


    }

}
