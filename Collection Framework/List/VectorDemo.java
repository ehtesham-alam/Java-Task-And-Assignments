import java.util.*;
class VectorDemo
{
	public static void main (String ars[])
	{
		Vector v  = new Vector();
		//Vector v  = new Vector(25);
		//Vector v  = new Vector(10,5);
		System.out.println(v.capacity());
		for(int i=0; i<10; i++)
		{
		  v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		v.addElement(v);
	}
}