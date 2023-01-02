 import java.util.Scanner;
 class Program
 {
	public static void main(String ar[]) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter your salary:");
	int Sal = obj.nextInt();
	if(Sal>=10000)
	{ 
	 int b = (Sal*10)/100;
	 Sal = Sal+b;
	}
	else
		{
		 int b =(Sal*Sal)/100;
		 Sal = Sal+b;
		}
	}
 }