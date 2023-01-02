class TestProgram3
{
	public static void main(String args[])
	{	
		int a=1;
		for(int i=0;i<=3;i++)
		{
			if(i%2==0)
			{
			  a=1;
			 }
			 else
			 {
			   a=0;
			  }
	    for(int j=0;j<=i;j++)
		 {
			System.out.print(a +" ");
            if(a==1)
			{
			  a=0;
			}
			else
			a=1;
		}
		System.out.println();
		
		
	 }
  }

}