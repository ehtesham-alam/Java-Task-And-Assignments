class OverloadedDemo4
{
	public void m1(int x)
	{
	  System.out.println("General Method");
	}
	public void m1(int......,x)
	{
	  System.out.println("var_arg method");
	}
	public static void main(String arg[])
	{
		OverloadedDemo4 old = new OverloadedDemo4();
		old.m1();
		old.m1(10,20);
		old.m1(10);
	}

}