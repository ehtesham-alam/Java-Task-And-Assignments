import java.io.*;

class DemoFile5
{
	public static void main(String arg[]) throws IOException {
	int Count=0;
	File f = new File("d://faltu");
	String[] s = f.list();
	for(String s1 : s)
	{
	  Count++;
	  System.out.println(s1);
	 }
	 System.out.println("The total num : "+Count);
	
	}

}

