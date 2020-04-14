import java.util.Scanner;
 
 
class arrques2{
  
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
     
        int i;
        
        
        System.out.println("Enter 10 numbers");
    int Integer[]=new int[10];
    System.out.println("enter the Integer");
    for(i=0 ; i<10 ; i++)

    {
    Integer[i]= sc.nextInt();
}

System.out.println("elmem=f array are :");
	for(i=9; i>=0; i--)
	{
		System.out.println(Integer[i]);
	}
}
}
        