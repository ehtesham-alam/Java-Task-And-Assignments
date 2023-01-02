class ExceptionProgram2
{
	public static void main(String[] args) {
    String name = "123"; 

    try 
    {
		int num= Integer.parseInt(name);
		System.out.println(num);
	  }
    catch(NumberFormatException e)
	{
        System.out.println("Number Format Exception");
    }

  }
}