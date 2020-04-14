import java.util.Scanner;
class calculator
{ 
    
    public static void main(String args[]) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two number"); 
    int a,b,result;
    char operator;
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("enter the operation(+,-,*,/)");
    operator= sc.next().charAt(0);
    switch(operator)
    {
    
        case '+':
        {
        result=a+b;
         System.out.println(result); 
         break;
     }
     
        case'-':
        {
            result=a-b;
         System.out.println(result); 
         break;
     }
     
        case'*':
        {
            result=a*b;
        System.out.println(result); 
         break;
     }
     
        case'/':
        {
            result=a/b;
         System.out.println(result); 
         break;}
    }
}
    } 
