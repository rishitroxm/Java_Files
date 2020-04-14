import java.util.Scanner;
class array
{ 
    
    public static void main(String args[]) 
    {
    Scanner sc = new Scanner(System.in);
    int i;
    int marks[]=new int [10];
    for(i=0 ; i<10 ; i++)
    {
    System.out.println("enter the marks of students");
    marks[i]=sc.nextInt();
}


	for(i=0 ; i<10 ; i++)
	{
		System.out.println("marks : "+marks [ i ] );
	}
}
}


