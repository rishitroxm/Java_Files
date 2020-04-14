class Student
{
    String name;
    int rollno;
    void display()
    {

        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);

    }
}
public class StudentDemo 
{
    public static void main(String[] args)
     {
        Student s1 = new Student();
        s1.name = "John";
        s1.rollno = 2;
        s1.display();


           
    }
}