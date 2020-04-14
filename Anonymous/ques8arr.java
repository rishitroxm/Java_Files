import java.util.Scanner;
class ques8arr
{ 
    
    public static void main(String args[]) 
    {

    Scanner sc = new Scanner(System.in);
    int i,j,k=0;
    int array1[]= new int[5];
    int array2[]= new int[5];
    System.out.println("enter the number for array1:");
    for(i=0 ; i<5 ; i++)
    {
    array1[i]=sc.nextInt();
   }
    System.out.println("enter the number for array2 :");
    
    for(j=0 ; j<5 ; j++)
   {
    array2[j]=sc.nextInt();
    }
    
    for(i=0; i<5;i++)
{
	for(j=0; j<5;j++)
{
	if(array1[i]==array2[j])
		k=1;
}
}
if(k==1)
{
System.out.println("same");
}
else
{	
		System.out.println("not same");
}

}
}

