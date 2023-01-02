class Super1
{
	super1()
	{
	  System.out.println("Super class Constructor");
	}
}
class Child2 extends Super1
{
	child2()
	{
	 super();
	}
}
class SuperTest
{
	public static void main(String args[])
	{
	  Child2 obj = new Child2();
	}

}