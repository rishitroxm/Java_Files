import java.util.Scanner;
class ques8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
char a;
System.out.println("Enter a Character: ");
a=sc.next().charAt(0);
if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U')
System.out.println("Vowels");
else
System.out.println("error");
}
}
