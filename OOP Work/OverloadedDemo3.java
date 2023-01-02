class OverloadedDemo3
{
	public void m1(int i,float f)
	{
	  System.out.println("int float _ version");
	}
	public void m1(float f,int i)
	{
	  System.out.println("float int _ version");
	}
	public static void main(String arg[])
	{
		OverloadedDemo3 old =  new OverloadedDemo3();
		old.m1(10,10.5f);
		old.m1(10.5f,10);
		//old.m1(10,10);       //  reference m1() is ambiguous
		//old.m1(10.5f,10.5f); // cannot find symbol symbol: method m1(float,float) Location: class OverloadedDemo3
	}



}