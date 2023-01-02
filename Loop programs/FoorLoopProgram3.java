class FoorLoopProgram3
{
	public static void main(String args[]){
	int fact=1;
	int i,j;
	for(i=1;i<=5;i++)
	{
		System.out.print(i+"=");
	fact=1;
	for(j=1;j<=i;j++)
	{
		fact=fact*j;
	}
	System.out.println(fact);
  }


 }
}