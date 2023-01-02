class OverloadedDemo
{
	public void m1()
	{
	  System.out.println("no_arg");
    }
	public void m1(int i)
	{
	  System.out.println("int_arg");
	}
	public void m1(double d)
	{
	  System.out.println("double_d");
	}
	public static void main(String arg[])
	{
		OverloadedDemo old = new OverloadedDemo();
		old.m1();
		old.m1(10);
		old.m1(10.5);
		old.m1('c');
		old.m1(10.8l);        //compile time error
	}
}