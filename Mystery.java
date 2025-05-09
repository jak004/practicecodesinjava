public class Mystery{
public static void main(String[]args){
    int y=0; int x=1; int total=0;
while(x<=10) 
{
    y=x*x;
    System.out.println("The value of y is " + (y+=2));
    total+=y;
    ++x;
}
{
    System.out.println("\n The value of total is " + (total*=2));
    System.out.println("\n The value of x is "+x);
    System.out.println("\n The value of y is "+y);
    
    y=y*x;
    System.out.println("\n The value of y is " +y);
    
}

}
}       
    

    
