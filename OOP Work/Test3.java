class A 
{
	A()
	{
	  System.out.println("Constructor in Class A");
	}
}
class B extends A
{
	B()
	{
	  System.out.println("Constructor in Blass B");
	}
}
class Test3
{
	public static void main(String args[])
	{
	  B obj = new B();
	}
}