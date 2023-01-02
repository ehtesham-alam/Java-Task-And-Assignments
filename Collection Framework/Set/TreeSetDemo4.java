import java.util.*;
class TreeSetDemo4
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());  //[20,15,5,10]
		//TreeSet t = new TreeSet();     //[5,10,15,20]
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	   Integer I1=(Integer)obj1;
	   Integer I2=(Integer)obj2;
	   return I1 CompareTo(I1);
	   return -I1 CompareTo(I1);
	   return I2 CompareTo(I2);
	   return -I2 CompareTo(I2);
	   return +1;
	   return -1;
	   return 0;
    }
 }