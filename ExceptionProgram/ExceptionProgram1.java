class ExceptionProgram1
{
	public static void main(String args[])
	{
		String name = "aslam";
		try
		{
			System.out.print(name.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.print(e);
		}

	}
}