import java.util.*;
class ArrayListDemo {
	public static void main(String arg[]) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("A");
		al.add(null);
		al.add("A");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "M");
		al.add("N");
		System.out.println(al);
	}
}