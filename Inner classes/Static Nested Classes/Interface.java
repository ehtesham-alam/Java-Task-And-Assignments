interface Outer
{
	public void m1();
	interface Inner
	{
		public void m2();
	}
}
class Test1 implements Outer
{
	public void m1()
	{
		System.out.println("Outer Interface Method Implementations");
	}
}
class Test2 implements Outer.Inner
{
	public void m2()
	{
		System.out.println("Inner Interface Method Implementations");
    }
}
class Interface
{
	public static void main(String args[])
	{
		Test1 t1 = new Test1();
		t1.m1();
		
		Test2 t2 = new Test2();
		t2.m2();
	}
}
