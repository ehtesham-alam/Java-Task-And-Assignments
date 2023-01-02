class ForLoopProgram1
{
	public static void main(String args[]){
	int fact=1;
	int a=5;
	if(a%2==0)
	{
		System.out.println("even");
	}
	else 
	{
		System.out.println("odd");
	
	}
	for(int i=1;i<=a;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
  }
	 


}