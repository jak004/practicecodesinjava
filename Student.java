public class Student{
    String name;
    int rollno;
    double cgpa;

    void StudentName()
    {
        System.out.println("The name of the student.");
    }
    void StudentFee()
{
    System.out.println("The roll no of student");
}
public static void main(String[]args)
{
    Student s1=new Student();//create object of class
    s1.StudentFee();
    s1.StudentName();
}


}
