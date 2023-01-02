class MethodLocal2
{
	int x = 10;
	static int y = 20;
	
	public void m1()
	/*public static void m1()  non-static variable x cannot be 
	{                          referenced from a static context*/
		class Inner
		{
			public void m2()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String args[])
	{
		MethodLocal2 ml = new MethodLocal2();
		ml.m1();
	}
}