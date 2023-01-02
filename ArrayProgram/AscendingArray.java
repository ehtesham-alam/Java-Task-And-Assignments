class AscendingArray
{
	public static void main(String arg[]) {
	int[] a={50,80,2,1,0,150};
	
	int min,temp=0;
	for(int i=0;i<a.length;i++)
	{
		min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j] < a[min])
			{
			  min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	 }
 }