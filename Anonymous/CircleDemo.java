 class Circle
{
	double radius;
	double findArea()
	{
	return radius * radius * 3.14 ;
}
    void displayArea()
    {
    	System.out.print("Area ="+findArea());
    }
}
    class CircleDemo
    {
    public static void main(String args[])
    {
    	Circle c1 = new Circle();
    	c1.radius = 5.0;
    	c1.displayArea();


    }
}

