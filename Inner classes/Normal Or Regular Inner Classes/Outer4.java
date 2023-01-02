class Outer4
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner Classes Method");
		}
	}
	public static void main(String args[])
	{
		Outer4 o = new Outer4();
		Outer4.Inner i = o.new Inner();
		i.m1();
	}
}