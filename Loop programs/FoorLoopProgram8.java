class FoorLoopProgram8
{
	public static void main(String args[]) 
	{
		for(int i=1;i<=5;i++)
		{
		  for(int k=1;k<i;k++)
		  {
			System.out.print("  ");
		  }
		  int a=1;
		  for(int k=5;k>=i;k--)
		  {
			System.out.print(a+"   ");
			a++;
		  }
		  System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
		  for(int j=5;j>i;j--)
		  {
			System.out.print("  ");
		  }
		  int a=1;
		  for(int k=1;k<=i;k++)
		  {
			System.out.print(a+"   ");
			a++;
		   }
		   System.out.println();
		  
		  
	    }
	
    }
	
 }