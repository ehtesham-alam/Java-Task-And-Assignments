class OverloadedDemo1 {
	public void m1(Object o) 
    {
	  System.out.println("object_version");
	}
	public void m1(String s ) 
	{
	  System.out.println("String_version");
	}
	public static void main(String args[]) {
		OverloadedDemo1 old = new OverloadedDemo1();
		old.m1(new Object());
		old.m1("Sanjay");
		old.m1(null);
	}
 }