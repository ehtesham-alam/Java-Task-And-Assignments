class Test3
{
	int i = 10;
	static int j = 20;           // QNo3
	
	//public static void m1()
	public void m1()
	{
		int k = 30;
		final int m = 40;
		
		class Inner
		{
			public static void m2()
			{
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(m);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String args[])
	{
		Test3 t = new Test3();
		t.m1();
	}
}