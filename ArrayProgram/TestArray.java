class TestArray
{
	public static void main(String arg[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		
		int temp=40;
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==temp)
			{
				System.out.println("Number Found at Location " +i);
				b=1;
			}
		}
		if(b==0)
		{
			System.out.println("Number Not Found");
		}
	}
}