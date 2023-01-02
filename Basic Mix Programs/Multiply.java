import java.util.Scanner;
class Multiply {
	public static void main(String arg[]) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int firstNo = ob.nextInt();
		System.out.println("Enter second number : ");
		int SecondNo = ob.nextInt(); 
		int multiply = ((firstNo * SecondNo) + firstNo) - SecondNo;
		System.out.println("multiply of number is"+multiply);
	}
}