import java.util.Scanner;
class minutes
 {

    
    public static void main(String[] args) 
    {
     float minutes;
     float year,month,day;
    	 Scanner sc = new Scanner(System.in);


        System.out.print("enter the number of minutes");
        minutes=sc.nextFloat();
    

      year = minutes / 525600;
       month= minutes / 43200;
    day = minutes / 1440;

    System.out.print(" "+year+"-"+month+"-"+day);
}
}
    