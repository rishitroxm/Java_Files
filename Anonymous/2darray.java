import java.util.Scanner;
class array2
{ 
    
    public static void main(String args[]) 
    {

    Scanner sc = new Scanner(System.in);
    int i , j ;
    int marks[][]=new int [4][4];
     System.out.println("enter the marks of students");
    for(i=0 ; i<4 ; i++)
    {
        for(j=0 ; j<4 ; j++)
            {
                marks[i][j]=sc.nextInt();
            }
    }
     System.out.println("marks is : ");
     for(i=0 ; i<4 ; i++)
     {
        for(j=0 ; j<4 ; j++)
        {
             System.out.println(marks[i][j]);

        }
     }
 }
}