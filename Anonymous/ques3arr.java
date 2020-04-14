import java.util.Scanner;
class ques3arr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		int i,j=0,k=0;
		int evenarray[]=new int[10];
		int oddarray[]=new int[10];
		System.out.println("Enter the elements of array: ");
		for (i=0;i<10;i++)
		{
 	array[i]=sc.nextInt();
	}
for(i=0;i<10;i++)
{
	if(array[i] %2 == 0)
{
		evenarray[j]=array[i];
		j++;
}
}
System.out.println("Even number of elements are: ");
for(j=0;j<10;j++)
{
System.out.println(evenarray[j]);
}

for(i=0;i<10;i++)
{
	if(array[i] %2 == 1)
{
	oddarray[k]=array[i];
	k++;
}
}
System.out.println("Odd number of elements are: ");
for(k=0;k<10;k++)
System.out.println(oddarray[k]);
}
}