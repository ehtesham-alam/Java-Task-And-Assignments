import java.io.*;
class FileDemo {
	
	public static void main(String arg[]) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}
}