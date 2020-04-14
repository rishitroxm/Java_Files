import java.util.scanner;
class Complex
{
	static double real1=3.0,real2=3.4;
    static double img1=3.2,img2=1.2;

    static double sum1()
    {
    	return real1+real2;
    }
    static double sum2()
    {
    	return img2+img1;
    }
    static double diff1()
    {
    	return real1-real2;
    }
    static double diff2()
    {
    	return img1-img2;
    }
    static double product1()
    {
    	return real1*real2;
    }
    static double product2()
    {
    	return img1*img2;
    }
}
	class ComplexDemo
	{
		public static void main(String args[])
		{
			System.out.println("sum"+sum1()""+sum2()+"i");
			System.out.println("differnce"+diff1()""+diff2()+"i");
			System.out.println("product"+product1()""+product2()+"i");
		}
	}