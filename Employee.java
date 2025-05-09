
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
double RegularRate=5;
double OvertimeRate=0.5*RegularRate;
System.out.println("Input the number of employees: ");
int employee=s1.nextInt();
for(int i=1;i<=employee;i++)
{
        System.out.println("How many hours have you worked for? : ");
        double hours=s1.nextDouble();
        System.out.println("How many children do you have? : ");
        int children=s1.nextInt();
        if(hours<40)
        {
                double GrossPay=RegularRate*hours;
                double IncomeTax = 0.15 * GrossPay;
                double NHIL = 0.025 * GrossPay;
                double DistrictTax = 0.01* GrossPay;
          if(children>3)
          {
double EduFund=0.5*(children-3);
double NetPay = GrossPay -(IncomeTax+NHIL+DistrictTax+EduFund);
System.out.println("The Gross Pay is $ "+GrossPay);
System.out.println("The Income Tax is $ "+IncomeTax);
System.out.println("The  National Health Levy is $ "+NHIL);
System.out.println("The District Tax is $ "+DistrictTax);
System.out.println("The Education Fund Contribution is $ "+EduFund);
System.out.println("The net pay is $ "+NetPay);

          }else
          {
            double EduFund=0;
            double NetPay = GrossPay -(IncomeTax+NHIL+DistrictTax+EduFund);
            System.out.println("The Gross Pay is $ "+GrossPay);
            System.out.println("The Income Tax is $ "+IncomeTax);
            System.out.println("The  National Health Levy is $ "+NHIL);
            System.out.println("The District Tax is $ "+DistrictTax);
            System.out.println("The Education Fund Contribution is $ "+EduFund);
            System.out.println("The net pay is $ "+NetPay);
          }
          
        
        }else
        {
               double GrossPay = RegularRate * 40 + OvertimeRate* (hours-40);
               double IncomeTax = 0.15 * GrossPay;
               double NHIL = 0.025 * GrossPay;
               double DistrictTax = 0.01* GrossPay;
               if(children>3)
               {
     double EduFund=0.5*(children-3);
     double NetPay = GrossPay -(IncomeTax+NHIL+DistrictTax+EduFund);
     System.out.println("The Gross Pay is $ "+GrossPay);
     System.out.println("The Income Tax is $ "+IncomeTax);
     System.out.println("The  National Health Levy is $ "+NHIL);
     System.out.println("The District Tax is $ "+DistrictTax);
     System.out.println("The Education Fund Contribution is $ "+EduFund);
     System.out.println("The net pay is $ "+NetPay);
    }else
    {
      double EduFund=0;
     double NetPay = GrossPay -(IncomeTax+NHIL+DistrictTax+EduFund);
     System.out.println("The Gross Pay is $ "+GrossPay);
System.out.println("The Income Tax is $ "+IncomeTax);
System.out.println("The  National Health Levy is $ "+NHIL);
System.out.println("The District Tax is $ "+DistrictTax);
System.out.println("The Education Fund Contribution is $ "+EduFund);
System.out.println("The net pay is $ "+NetPay);
               
        } 
      
      }
    

      
    

            
        

            
        



        }
}

}