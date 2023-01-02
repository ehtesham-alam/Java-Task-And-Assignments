import java.io.*;

class DemoFile 
{
	public static void main (String args[]) throws IOException {
	File f = new File("Sanjay");
	f.mkdir();
	File f1 = new File("Sanjay","khatri.txt");
	f1.createNewFile();
	System.out.println(f1.exists());
 }

}