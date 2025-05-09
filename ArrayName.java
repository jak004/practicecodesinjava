import java.util.Scanner;

public class ArrayName
 {
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of names you want to store: ");
        Scanner s1=new Scanner(System.in);
        int num=s1.nextInt();
        String[]name=new String[num];
        for(int i=1;i<=num;i++)
        {
            System.out.println("Enter your  first name : ");
            String f_name=s1.next();
            System.out.println("Enter your  middle name : ");
            String m_name=s1.next();
            System.out.println("Enter your  last name : ");
            String l_name=s1.next();
            System.out.println("Enter your age : ");
            int age=s1.nextInt();
            String fullname= f_name+ " "+m_name+ " "+l_name;
            System.out.println("My name is  " +fullname);
            System.out.println("I am "+age+ " years old.");
            System.out.println(" ");
        }
        
        System.out.println("Enter the number of numbers: ");
        int number=s1.nextInt();
        System.out.println("");
        int odd[]=new int[number];
        for(int i=1;i<=number;i++)
        {
            if(i%2==0)
        
            {
                System.out.println(i);
    
            }
        
        }
        





        
    }
    
}
