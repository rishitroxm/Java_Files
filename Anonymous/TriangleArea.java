import java.math.*;
class Triangle
{
	double side1, side2, side3;

	Triangle()
	{
	side1=3.0;
	side2=4.0;
	side3=5.0;
	}
	
	double area()
	{
	double s=side1+side2+side3;
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	double perimeter()
	{
	return side1+side2+side3;
	}
	void display()
	{
	System.out.println("area:" +area());
	System.out.println("perimeter" +perimeter());
	}
}
public class TriangleArea
{
	public static void main(String[] args)
	{
	Triangle a= new Triangle();
	a.display();

	}
}