class BinarySearch
{
	public static void main(String arg[]) 
	{
		int[] a={50,80,2,1,0,150};
		
		int srch=2;
		int l=0;
		int h=a.length-1;
		int m=(l + h)/2;
		
		while(l <= h)
		{
			if(a[m]==srch)
			{
				System.out.println("element is at "+m+" index position");
				break;
			}
			else if(a[m]<srch)
			{
				l = m+1;
			}
			else
			{
				h = m-1;
			}
			m=(l+h)/2;
		}
		if(l>h)
		{
			System.out.println("element not found");
		}
	
	}
}