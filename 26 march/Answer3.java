
class Base
{
	
		void print()
	{System.out.println("This is to show addition,subtraction");}

}


interface addition
{
	public void add(int x,int y);
}
	


interface subtraction extends addition
{
	public void sub(int x,int y);

}


class Last extends Base implements subtraction
{
	int sum;
	int sub;
	
	public void add(int x,int y)
	{System.out.println(x+y);}
	

	public void sub(int x, int y)
	{System.out.println(x-y);}


}


class  Answer3
{
	public static void main(String[] args) 
	{
		Last l=new Last();
		l.print();
		l.add(10,20);
		l.sub(15,6);

	}
}

