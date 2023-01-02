import java.io.*;
class FileDemo2 {
	
	public static void main(String arg[]) throws IOException {
		File f = new File("akash");
		System.out.println(f.exists());
		f.createNewFile();
		//f.mkdir();
		System.out.println(f.exists());
	}
}