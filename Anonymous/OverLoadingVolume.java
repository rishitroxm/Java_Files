import java.util.Scanner;
class OverLoading
{
	
		
		double volume()
		{
		System.out.println("No Parameter");
		}
		
		double volume(double radius, double height)
		{

		double result = 3.14* radius * radius*height;
		System.out.println("result"+result);

		}
		
		double volume(double radius)
		{

		double result = 3.14*radius*radius;
		System.out.println("result"+result);
		}

class OverLoadingVolume
{
	public static void main(String[] args)
	{

	OverLoading V1 = new Overloading();
	 V1.volume();
	 V1.volume(5,8);
	 V1.volume(5);
}
	
}
}
