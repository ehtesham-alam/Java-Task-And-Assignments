class P
{
	public void property()
	{
	  System.out.println("Cash+Land+Gold");
	}

	public void marry()
	{
	  System.out.println("Subha Luxmi");
	}
}
class C extends P
{
	public void marry()
	{
	  System.out.println("3sha|4me|9tara");
		
	}
}
class OverridingDemo2
{
	public static void main(String args[])
	{
		P p = new P();
		p.marry();
		C c = new C();
		c.marry();
		P m = new C();
		p.marry();
	}
}