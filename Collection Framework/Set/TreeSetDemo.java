import java.util.*;
class TreeSetDemo
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		//System.out.println(t.add new Integer(10));   // ClassCastException
		//System.out.println(t.add(null));  // NullPointerException
		System.out.println(t);   // [A,B,Z,L,a]
	}
}