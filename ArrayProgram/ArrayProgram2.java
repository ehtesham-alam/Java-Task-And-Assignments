class ArrayProgram2 
{
	public static void main(String arg[])
	{
		int []a={60,81,29,33,44};
		int max = a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		System.out.println("max: " + max);
		
		}

}