import java.io.*;

class DemoFile2 
{
	public static void main (String args[]) throws IOException {
	File f = new File("Sanjay123");
	f.mkdir();
	File f1 = new File(f,"khatri123.txt");
	f1.createNewFile();
	System.out.println(f1.exists());
 }

}