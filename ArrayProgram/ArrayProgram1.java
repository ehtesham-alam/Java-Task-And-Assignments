class ArrayProgram1 
{
	public static void main(String arg[])
	{
		int marks[]={1,3,4,5,6,7,8,9,10,11};
		int counteven=0, ctrodd=0;
		for(int i=0;i<marks.length;i++){
		if(marks[i]%2==0)
		{
			counteven++;
		}
		else
			ctrodd++;
		}
	System.out.println("total even: " + counteven);
	System.out.println("total odd: " + ctrodd);
		
	}

}