class SecondMini
{
	public static void main(String[] args) 
	{
		 int[] a = {6, 10, 5, 9, 7,15 };
		    int Mini = 1000;
		    int secondMini = 1000;
		    for (int i = 0; i < a.length; i++) 
		    {
		        if(a[i]==Mini)
		        {
		          secondMini=Mini;
		        } 
		        else if (a[i] < Mini) 
		        {
		            secondMini = Mini;
		            Mini = a[i];
		        } 
		        else if (a[i] < secondMini) 
		        {
		            secondMini = a[i];
		        }

		    }
		    System.out.println(secondMini);
	}
}
