class ForLoopProgram2
{
	public static void main(String args[]){
	int a=49;
	int count=0;
	int b=1;
	int i;
	for(i=1;i<49;i++)
		if(a%i==0)
		{
			count++;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("notprime");
		}
		for(i=1;a!=0;i++)
		{
			int rem=a%10;
		    int sum=a + rem;
			a=a/10;
		}
		System.out.println("sum"+ a);
	
	}
	
	
	
	
}


