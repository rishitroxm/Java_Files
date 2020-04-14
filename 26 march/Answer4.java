abstract class Shape{

public abstract int Rect(int length, int breadth);
public abstract int Squa(int side);
public abstract double Circle(int radius);	
}

class A extends Shape{
	public int Rect(int length, int breadth){
		return(length*breadth);
	}
	public int Squa(int side){
		return(side*side);
	}
	public double Circle(int radius){
		return(3.14*radius*radius);
	}
}

public class Answer4{
	public static void main(String args[]){
		

		A a=new A();

		System.out.println(a.Rect(5,6));
		System.out.println(a.Squa(5));
		System.out.println(a.Circle(6));
	}
}