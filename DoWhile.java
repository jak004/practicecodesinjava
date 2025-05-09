import java.util.Scanner;

public class DoWhile
{
    public static void main(String[] args) 
    {
     int i=1;
     do{
        System.out.print("Enter username: ");
        Scanner s1=new Scanner(System.in);
        String username=s1.next();

        System.out.print("Enter password: ");
        Scanner s2=new Scanner(System.in);
        String password=s2.next();

        if(username.contains("Julius")&&password.contains("Jesus"))
        {
            System.out.print("You have been logged in.");
            break;

        }
        System.out.print("Please enter correct username and password");
        i++;

     }while(i<=3);
        
    }
}