
import java.util.Scanner;
public class Switchcase
{
    public static void main(String[]args)
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter alphabet to check whether it is a vowel or consonant : ");
        char alpha=s1.next().charAt(0);
        switch(alpha)
        {
            case 'a':
            System.out.println("This is a vowel.");
break;
case 'e':
System.out.println("This is a vowel.");
break;
case 'i':
System.out.println("This is a vowel.");
break;
case 'o':
System.out.println("This is a vowel.");
break;
case 'u':
System.out.println("This is a vowel.");
break;
default:
System.out.println("This is a consonant.");

        }
    }
}