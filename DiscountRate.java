import java.util.Scanner;

public class DiscountRate {
public static void main(String[] args) 
{
System.out.println("Enter price of single unit :");
Scanner s1=new Scanner(System.in);
int price=s1.nextInt();
System.out.println("Enter the quantity you want to purchase.");
Scanner s2=new Scanner(System.in);
int quantity=s2.nextInt();
float discount_amt=0f;
float revenue=0f;
float discount_rate=0f;
if (quantity<100)
{
    revenue=quantity*price;
}
else if(quantity>100&&quantity<120)
{
discount_rate=(float)10/100;
revenue=quantity*price;
discount_amt=revenue*discount_rate;
revenue -=discount_amt;

}
else if(quantity>120)
{
    discount_rate=(float)15/100;
    revenue=quantity*price;
    discount_amt=revenue*discount_rate;
    revenue-=discount_amt;

}
else
{
    System.out.print("Please enter correct quantity.");
}
System.out.println("Revenue : "+revenue +"$");
System.out.println("Discount : "+discount_amt+ "$ Rate: ("+discount_rate+"%) ");

}    
}
