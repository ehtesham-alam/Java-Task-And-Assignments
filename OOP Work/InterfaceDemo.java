interface A
{
	int roll;
	public void disp a();
 }
 interface B
 {
	void disp b();
 }
 class C implements A,B
 {
	 void disp a()
	{
		System.out.println("Roll Number"+roll);
	}
	public void disp b()
	{
		System.out.println("Method From B interface");
	}
  }
  class InterfaceDemo
  {
	public static void main(String arg[])
	{
		C obj = new C();
		obj.disp a();
		obj.disp b();
	}
  }