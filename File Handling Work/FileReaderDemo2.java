import java.io.*;

class FileReaderDemo2
{
	public static void main(String args[]) throws IOException
	{   
	    File f = new File("abc.txt");
		FileReader fr = new FileReader("abc.txt");
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		
		System.out.print(ch);
		
		for(char ch1 : ch)
		{
			System.out.print(ch1);
		}
	}
}