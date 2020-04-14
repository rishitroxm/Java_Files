import java.util.Scanner;
 class ques9 
{ 
     public static void main(String[] args ) 
    { 
        int i, j;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(i=1; i<n+1; i++){
            j=0;
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
}
}