import java.util.Scanner;
class Circle
{
static double radius=25.0;
static double Area()
{
	return 3.14*radius*radius;
}
static void display()
{
	System.out.println("area"+Area());
}
} 




class StaticCircleDemo{
public static void main(String args[])
{
Circle.display();
}
}


