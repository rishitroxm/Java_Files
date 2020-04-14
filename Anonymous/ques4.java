import java.util.Scanner;
 class ques4
  {

    
  public static void main(String[] args)
    {
    	int num,num1,num2,num3,num4,num5;
    	do{
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 5 digits number : ");
        num= sc.nextInt();
        if( num>99999 || num<100000)
        	System.out.println(" Error please enter 5 digit num again:");
    }
    while(num>100000 || num<9999);
    	num1=num/10000;
        num2=(num%10000)/1000;
        num3=((num%10000)%1000)/100;
        num4=(((num%10000)%1000)%100)/10;
        num5=((((num%10000)%1000)%100)%10);
        System.out.print(num1+"   "+num2+"   "+num3+"   "+num4+"   "+num5);
    }
}


