import java.util.Scanner;
class java 
{ 
    
    public static void main(String args[]) 
    {
    Scanner sc = new Scanner(System.in);
    int a,b,sum;
    System.out.println("enter two number to be added"); 
    a=sc.nextInt();
    b=sc.nextInt();
    sum=a+b;
    System.out.println("the sum of two number is  " +sum);
    } 
}