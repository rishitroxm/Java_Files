public class Holiday
{
	public String name;
	public String day;
	public String month;
}
public Holiday(String n , int d , String d)
{
	name = n;
	day = y; 
	month = m;
}
public boolean inSameMonth(Holiday h)
{
	return this.month.equal(h.month);
}
public static double avgdate(Holiday[]h)
{
	int sum=0;
	for(int i=0; i<h.length;i++)
	{
		sum=sum+h[i].day;
	}
	return((double)sum)/h.length
}
class main
{
	public static void main(String []args)
	{
		Holiday h = new Holiday("Independence Day",4,"july");
	}
}