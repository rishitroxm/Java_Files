import java.util.Scanner;
class pro
{ 
    
    public static void main(String args[]) {
    	int a;
    	Scanner sc=new Scanner(System.in);
    	int ch;
    	do{
    		System.out.println("Do you want to use calendar? -> (1 if Yes, 0 if no)");
    		ch = sc.nextInt();
	    	System.out.println("enter a number between 1 to 12 :-") ;
		    a=sc.nextInt();
		    if(ch==0){
		    	break;	
		    }else{
			    switch(a)
			    {
			    	case 1:
			    	{
			    		System.out.println("jan");
			    		break;
			    	}
			    	case 2:
			    	{
			    		System.out.println("feb");
			    		break;
			    	}
			    	case 3:
			    	{
			    		System.out.println("march");
			    		break;
			    	}
			    	case 4:
			    	{
			    		System.out.println("april");
			    		break;
			    	}
			    	case 5:
			    	{
			    		System.out.println("may");
			    		break;
			    	}
			    	case 6:
			    	{
			    		System.out.println("june");
			    		break;
			    	}
			    	case 7:
			    	{
			    		System.out.println("july");
			    		break;
			    	}
			    	case   8:
			    	{
			    		System.out.println("aug");
			    		break;
			    	}
			    	case 9:
			    	{
			    		System.out.println("sept");
			    		break;
			    	}
			    	case 10:
			    	{
			    		System.out.println("oct");
			    		break;
			    	}
			    	case 11:
			    	{
			    		System.out.println("nov");
			    		break;
			    	}
			    	case 12:
			    	{
			    		System.out.println("dec");
			    		break;
			    	}
			    }
			}
    	}while(ch==1);
	}
} 