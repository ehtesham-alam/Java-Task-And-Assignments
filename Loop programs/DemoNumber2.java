class DemoNumber2
{
	public static void main(String arg[])
	{
		int count=0;
		int num=100;
		int a=1;
		while(a<=num){
		if(num%a==0){
		count++;
		}
		a++;
		}
     if(count == 2){
	 System.out.println("prime = "+num);
	 }
	 else
	 System.out.println("not prime");
	 num++;
	
	}

}