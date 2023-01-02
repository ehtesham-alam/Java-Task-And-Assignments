class Number
{
	public static void main(String arg[])
	{
	   int i,j,r=5,n=1,c=5;
	   for(i=1;i<=r;i++)
	   {
		 System.out.println();
		 for(j=1;j<=c;j++)
		 {
		   System.out.print("*");
		   n++;
		 }
		 n=i+1;
		 c--;
	   
	   }
	}
}