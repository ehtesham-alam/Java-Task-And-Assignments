class Outer5
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner Classes Method");
		}
	}
	public void m2()
	{
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String args[])
	{
		Outer5 o = new Outer5();
		o.m2();
	}

}