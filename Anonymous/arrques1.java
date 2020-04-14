import java.util.Scanner;
class arrques1
{ 
    
    public static void main(String args[]) 
    {

    Scanner sc = new Scanner(System.in);
    int n,i,search=0;
    int number[]= new int[10];
    System.out.println("enter the number :");
    for(i=0 ; i<10 ; i++)
    {
    number[i]=sc.nextInt();

}
System.out.println("elementof array are :");
  for(i=0 ; i<10 ; i++)
  	{
  		System.out.println(number[i]);
}
System.out.println(" enter the number to be search in array :");
search = sc.nextInt();
  
  for(i=0 ; i<10 ; i++)
  {
  	if(search == number[i]){
  		System.out.println("number found to be at index value:" +i);
  	}
  
  else
  {
  	System.out.println("not found");
  	break;
  }
  	}
}
}