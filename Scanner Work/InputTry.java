import java.util.Scanner;

class InputTry {
	public static void main(String arg[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int firstNo = ob.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNo = ob.nextInt();
		int sum = firstNo + secondNo;
		System.out.println("Sum of Numbers is : "+sum);
	}


}