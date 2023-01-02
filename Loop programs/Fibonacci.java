class Fibonacci
{
	public static void main(String args[]){
	int a=1;
	int b=8;
	int c=1;
	int d=1;
	System.out.println("fibonacci series: ");
	while(a < b)
	{	
		System.out.print(c + " ");
		int sum = c + d;
		c=d;
		d=sum;
		a++;
    }
	
	
	}


}