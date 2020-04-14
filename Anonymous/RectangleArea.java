import java.util.*;
class Rectangle
{
 int length, breath;
 Rectangle(int l,int b)
 {
 length=l;
 breath=b;

 }
	double area()z
	{
	return length*breath;
    }
	void display()
	{
	System.out.println("area:" +area());
	
	}
}
  class RectangleArea
{
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);
	int l=sc.nextInt();
	int b=sc.nextInt();
	Rectangle a= new Rectangle(l,b);
	a.display();

	}
}