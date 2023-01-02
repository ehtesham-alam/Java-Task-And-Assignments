class A 
{
	int a;
	A(int x)
	{
		a = x;
		System.out.println("value of A"+a);
	}
}
Class B extends A
{
	int b;
	B(int x , int y)
	b = y;
	{
	  super(x);
	  
	  System.out.println("value of B"+b);
	}
}
class Test4
{
	public static void main(String args[])
	{
	  B obj = new B(100,200);
	}
}