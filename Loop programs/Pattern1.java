class Pattern1
{
	public static void main(String arg[])
	{
		for(int i=97;i<=102;i++)
		{
			for(int j=102;j>=i;j--)
			{
			 System.out.println(" ");
			}
			//char ch;
			for(char ch=i;ch>=i;ch--)
			{
			 System.out.println(ch);
			}
			for(char ch1=i+1;ch<=i;ch++)
            {
			  System.out.println(ch1);
			}
            System.out.println();		
		}
	}
}