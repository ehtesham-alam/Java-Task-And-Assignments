import java.util.*;
class IteratorDemo
{
	public static void main(String args[])
	{
		ArrayList  l = new ArrayList();
		for(int i=0;i<=10;i++)
		{
		  l.add(i);
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext())	
		{
		   Integer  n = (Integer)itr.next();
		   if((n%2)==0)
		   {
			 System.out.println(n);
		   }
		}
		System.out.println(l);
	}
}