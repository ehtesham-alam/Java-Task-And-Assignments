import java.io.*;

class DemoFile3
{
	public static void main(String arg[]) throws IOException {
	File f = new File("d://faltu","demo.txt");
	f.createNewFile();
	System.out.println(f.exists());
	}




}