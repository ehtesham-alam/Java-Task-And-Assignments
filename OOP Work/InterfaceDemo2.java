class Student 
{
	int m1,m2;
	void getmarks(int x,int y)
	{
		m1 = x;
		m2 = y;
	}
	void putmarks()
	{
		System.out.println("First : "+m1);
		System.out.println("Second : "+m2);
	 }
}
interface Sport
{
	final int sp = 6;
	public void spmarks();
}
class Result extends Student implements Sport
{
	int total;
	public void spmarks()
	{
	  System.out.println("Sport marks : "+sp);
	}
	public void disp()
	{
		putmarks();
		spmarks();
		int total = m1+m2+sp;
		System.out.println("Total : "+total);
	}
}
class InterfaceDemo2
{
	public static void main(String arg[])
	{
		Result obj = new Result();
		obj.getmarks(80,60);
		obj.disp();
	}
}
	
	
	
	
	








