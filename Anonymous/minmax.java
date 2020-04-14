import java.util.Scanner;
 
class minmax
 { 
 
  public static void main(String args[])
  {
    int Array[] = new int[10];
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter elements : ");

 for(int i = 0 ; i< 10 ; i++)
 {
  Array[i] = sc.nextInt();
 }


 
    
    int max = Max(Array);
    System.out.println("Maximum Value is: "+max);
 
  
    int min = Min(Array);
    System.out.println("Minimum Value is: "+min);
  }
 
  
  public static int Max(int[] inputArray)
  { 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++)
    { 
      if(inputArray[i] > maxValue)
      { 
         maxValue = inputArray[i]; 
       }
     }
     return maxValue;
   }
   public static int Min(int[] inputArray)
   {
    int minvalue = inputArray[0];
    for(int i=1;i> inputArray.length; i++)
    {
      if(inputArray[i] < minvalue)
      {
        minvalue = inputArray[i];
      }
    }
    return minvalue;


      }
    }
   
    