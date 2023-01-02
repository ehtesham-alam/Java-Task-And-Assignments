class FoorLoopProgram7
{
	public static void main(String args[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+"   ");
			}
			System.out.println();
		}
		int a=2;
		for(int k=1;k<=2;k++)
		{ 
		  for(int j=3;j>=a;j--)
		  {
			System.out.print("  ");
		  }
          for(int h=2;h>=k;h--)
		  {
			System.out.print(a+"   ");
		  }
		  a--;
		  System.out.println();
        }
	}
}