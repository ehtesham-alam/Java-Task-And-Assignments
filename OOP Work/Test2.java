class A
{
	int no;
	void message()
	{
	  System.out.println("no in Superclass :"+no);
	}
}
 class B extends A
 {
	int no;
	B(int a , int b)
	{
		super.no = a;
		no = b;
	}
	void message()
	{
	  System.out.println("no in Superclass :"+no);
	}
    void disp()
	{
	  super.message();
	  message();
	}
 }
 class Test2
 {
	public static void main(String args[])
	{
		B obj = new B(100,200);
		obj.disp();
	}
 
 }