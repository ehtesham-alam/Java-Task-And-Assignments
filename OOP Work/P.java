import java.io.*;
class P
/*{
	public void m1() throws IOException,InterruptedException    // No Error
	{
	}
}
class C extends P
{
	public void m1() throws  EOFException,InterruptedException
	{
	}
}*/
/*{
	public void m1() throws IOException
	                                    
	{
	}                                                          // Error
}
class C extends P
{
	public void m1() throws  EOFException,InterruptedException
	{
	}
}*/

/*{
	public void m1() throws Exception                       // No Error
	                                    
	{
	}
}
class C extends P
{
	public void m1() throws  EOFException,InterruptedException
	{
	}
}*/
/*{
	public void m1() 
	                                    
	{                                                        // Error
	}
}
class C extends P
{
	public void m1() throws  EOFException,InterruptedException
	{
	}
}*/