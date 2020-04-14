import java.util.Scanner;
 
class ques4arr
 { 
 
  public static void main(String args[])
  {
    int Array[] = new int[5];
    int i,sum=0,n;
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter elements : ");

 for(i = 0 ; i<5 ; i++)
 Array[i] = sc.nextInt();
 
 System.out.println("Case:1 sum of 5 digit number ");
System.out.println("Case:2 sum of allternative no ");
n=sc.nextInt();
switch(n)
{
case 1:
{

for(i=0;i<5;i++)
{
	sum+=Array[i];
}
	System.out.println("case:1 sum of 5 digit number "+sum);
break;
}
case 2:
 {
for(i=0;i<5;i+=2)
{
	sum+=Array[i];
}
	System.out.println("Case:2 sum of allternative no "+sum);
break;
}
}
}
}
