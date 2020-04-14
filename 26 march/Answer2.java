class Base
{
	void message()
	{ System.out.println("This is message function of Base Class"); }
}


interface inter 
{
	public void mymsg(); 
}

interface inter2 extends inter
{
	public void mymessage();
}


class Derived extends Base implements inter2
{
	void msg()
	{ System.out.println("This is msg function of Derived Class"); }

	public void mymsg()
	{ System.out.println("This is mymsg function of myinter interface"); }

	public void mymessage()
	{ System.out.println("This is mymessage function of myinter2 interface"); }

}


class Answer2
{
	public static void main(String args[])
	{
		Derived d=new Derived();
		d.message();
		d.msg();
		d.mymsg();
		d.mymessage();
	}
}