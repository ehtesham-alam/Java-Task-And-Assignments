class Super
{
	int x=10;
	public void disp()
	{
	  System.out.println("Super"+x);
	}
}
class Sub extends Super
{
	int y=20;
	public void disp()
	{
	  System.out.println("Super"+x);
	  System.out.println("Sub"+y);
	}
}
class OverridingDemo
{
	public static void main(String arg[])
	{
	  Sub  sb = new Sub();
	  sb.disp();
	}
}