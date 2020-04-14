abstract class Mark
{
 abstract double getPercentage();
}
class A extends Mark
{
 double res;
 A( int a, int b, int c)
 {
  res=(a+b+c)/3;
 }
 double getPercentage()
 {
  return res;
 }
}
class B extends Mark
{
 double res;
 B(int a, int b, int c, int d)
 {
  res=(a+b+c+d)/4;
 }
 double getPercentage()
 {
  return res;
 }
}
class Answer8
{
 public static void main(String args[])
 {
  
  Mark obj_1=new A(55,50,89);
  System.out.println(obj_1.getPercentage());
 
  Mark obj_2=new B(58,20,36,86);
  System.out.println(obj_2.getPercentage());
 }
}