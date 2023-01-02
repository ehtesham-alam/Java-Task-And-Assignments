class SwapProgram
{
	public static void main(String arg[]){
	int a=2;
	int b=5;
	System.out.println("Before: a = "+a+"\tb = "+b);
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("Ater: a = "+a+"\tb = "+b);
	
	
	}


}