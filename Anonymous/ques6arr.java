import java.util.Scanner;
class ques6arr
{ 
    
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int elements[][]=new int[3][3];
int i,j,k=0,l=0;
System.out.println("Enter the elements of array: ");
for (i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
  elements[i][j]=sc.nextInt();
  }
}
System.out.println("Entered elements of array are: ");
for (i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(elements[i][j]<99)

     k=1;
     else
{
    System.out.println("Enter elements less than 100: ");
    l+=1;
}
}
}
if(l==0)
{
System.out.println("entered elements are: ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(" " + elements[i][j]);
}
System.out.println("");
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
if(elements[i][j] %2 !=0 )
elements[i][j]*=2;
}



System.out.println("corected elements are: " );
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(" " + elements[i][j]);

}
System.out.println("");
}
}
}
}




       