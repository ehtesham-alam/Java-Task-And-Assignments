class ExceptionProgram3
{
	public static void main(String args[])
	{
		int []a=new int[2];
		a[0]=12;
		a[1]=13;
		try
		{
		  a [8] = 14;
	     }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
  
  } 
}