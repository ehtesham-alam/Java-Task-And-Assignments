import java.io.*;

class DemoFile6
{
	public static void main(String arg[]) throws IOException
	{
		int Count=0;
		File f = new File("d:\\faltu");
		String[] s = f.list();
		for(String s1 : s)
		{
		  File f1 = new File(f,s1);
		  //if(f1.isDirectory())
		  if(f1.isFile())
		  {
			Count++;
			System.out.println(s1);
		   }   
		}
	    System.out.println("The total num : "+ Count);
	}

}