class Prime
{
	public static void main(String args[])
	{
		int count=0;
		int num=100;
		int a=1;
			while(a <= num)
			{
				if(num % a == 0) {
				count++;
				}
				a++;
			}
			if(count == 2) {
			System.out.println("Prime = "+num);
			}
			else
			System.out.println("Not Prime");
			num++;
	 }

}