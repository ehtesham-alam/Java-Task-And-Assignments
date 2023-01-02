class Demo1
{
	public static void main(String arg[]){
	int num=1;
	int b=1;
	do
	{
		System.out.println(num);
		do
		{
			if(num%b==0)
			 System.out.println(b+",");
			 b++;
		   }
			while(b<=num);
			num++;
	       }			
			while(num<=6);
		
	      }
  
  }
  