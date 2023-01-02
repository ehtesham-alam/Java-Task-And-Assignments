Class Prime
{
	int a;
	void check (int a) {
	
	if(a % 2 == 0)
	{
		System.out.print("prime");
	 }
	else
	{
		System.out.print("Not Prime");
     }
  }
  public static void main(String arg[]) {
	Prime test = new Prime();
		test.check(2);
		test.check(6);
  }

}