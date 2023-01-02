class OverloadedDemo2{
	public void m1(String s) 
	{
	  System.out.println("String_Version");
	}
	public void m1(StringBuffer sb) 
	{
	  System.out.println("StringBuffer_Version");
	}
	public static void main(String args[]) {
		OverloadedDemo2 old = new OverloadedDemo2();
		old.m1("Sanjay");
		old.m1(new StringBuffer("Sanjay"));
		//old.m1(null);       // CE: reference to m1() is ambiguous
	}
 }