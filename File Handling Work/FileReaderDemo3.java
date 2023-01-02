import java.io.*;

class FileReaderDemo3
{
	public static void main(String args[]) throws IOException
	{   
	    File f = new File("abc.txt");
		FileReader fr = new FileReader("abc.txt");
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		
		for(char ch1 : ch)
		{
			System.out.print(ch1);
		
		}
       System.out.println("************************************************");
       FileReader fr1 = new FileReader("abc.txt");
	   int i = fr1.read();
		
		while(i != -1)
		{
			System.out.println((char)i);
			i = fr1.read();
		}
	}
  }