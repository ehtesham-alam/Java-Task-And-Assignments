import java.io.*;

class DemoFile4
{
	public static void main(String arg[]) throws IOException {
	File f = new File("d://faltu");
	String[] s = f.list();
	for(String s1 : s)
	{
	  System.out.println(s1);
	 }
	
	}

}