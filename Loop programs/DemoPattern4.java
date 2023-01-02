class DemoPattern4
{
	public static void main(String args[])
	{
	int a=1,b=1,c=3,d=9,f=3;
	boolean bol=false;
	while(a<=4)
	{
	  while(b<=d)
	  {
	    System.out.print("*");
		
		b++;
		if(bol&&b>f)
		{
		  int e=1;
		  while(e<=c)
		{
		   System.out.print(" ");
		   e++;
		 }
		  bol=false;
		  
		  c=c+2;
		 
	   }
	   
	  }	  
	 
	 
	    System.out.println("");
	    bol = true;
	    if(a!=1)
	    {
	      d++;
	      f--;
	     }
	      a++;
      } 
	}
}	