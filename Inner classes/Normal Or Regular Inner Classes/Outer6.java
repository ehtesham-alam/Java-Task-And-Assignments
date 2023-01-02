class Outer6
{
	int x = 10;
	static int y = 20;
	
	class Inner
	{
		public void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static void main(String args[])
	{
		new Outer6().new Inner().m1();
	}
}