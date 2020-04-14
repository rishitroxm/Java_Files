import java.util.Scanner;
 
class ques5arr
 { 
 
  public static void main(String args[])
  {
    int Array[] = new int[10];
    int i,j,no=0;
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter elements : ");

 for( i = 0 ; i< 10 ; i++)
 {
  Array[i] = sc.nextInt();
 }
 System.out.println("enter a no.");
 j=sc.nextInt();
 for(i=0;i<10;i++)
 {
 	if(Array[i]==j)
no++;
}
System.out.println("frequency="+no);
}
}
    


