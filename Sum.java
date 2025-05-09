import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Input first number : ");
        double firstnum=s1.nextDouble();
        System.out.print("Input second number : ");
        double secondnum=s1.nextDouble();
        double sum=firstnum+secondnum;
        System.out.println("The sum of the two numbers is "+sum);
    }

}
