class DemoFactorial
{
	public static void main(String arg[])
	{
		int num=15;
		int fact=1;
		int a=1;
		while(num<=1)
		{
		while(a<=num)
			fact=fact*a;
			a++;
		}
		System.out.println("factorial : " +fact);
		num++;
	
   }


}