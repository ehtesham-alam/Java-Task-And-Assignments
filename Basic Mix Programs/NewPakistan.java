class NewPakistan
{
	public static void main(String arg[])
	{
		int a=153;
        int originalvalue=a;
        int sum=0;
			while(a!=0)
			{
				int rem=a%10;
				sum = sum+rem*rem*rem;
				a = a/10;
			}
			if(originalvalue ==sum)
			{
				System.out.println("new pakistan num");
			}
		}
		
	}