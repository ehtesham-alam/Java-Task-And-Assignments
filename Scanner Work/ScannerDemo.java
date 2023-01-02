import java.util.*;

class ScannerDemo {
	public static void main(String arg[]) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter Integer Value:  ");
		int value = ob.nextInt();
		System.out.println("value is "+value);
	}
}