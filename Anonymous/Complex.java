import java.util.scanner;
class Complex
{
	double real;
    double img;
    public Complex(double real, double img) 
    {
        this.real = real;
        this.img = img;
    }
    public static void main(String[] args) 
     	{
        Complex n1 = new Complex(2.3, 4.5.5),
                n2 = new Complex(3.4, 5.0),
               int temp;
        temp = add(n1, n2);
        System.out.printf("Sum = %.1f + %.1fi" +temp.real+, +temp.img);
    	}
    	public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return(temp);
    }
}