import java.util.*;
class VectorDemo1 {
	public static void main(String args[]){
	Vector <String> v=new Vector<>();
		  System.out.println(v.capacity());
	v.addElement("Amir");
	v.addElement("sami");
	v.addElement("Sanjay");
	v.addElement("Amir");
	v.addElement("sami");
	v.addElement("Sanjay");
	v.addElement("Amir");
	v.addElement("sami");
	v.addElement("Sanjay");
	v.addElement("Ali");
	v.addElement("Amir");
	v.addElement("sami");
	v.addElement("Sanjay");
	
 System.out.println(v.capacity());
	  System.out.println(v.size());
	  System.out.println(v.elementAt(1));
	
		Enumeration e=v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}