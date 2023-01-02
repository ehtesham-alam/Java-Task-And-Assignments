import java.util.*;
class LinkedHashMapDemo
{
	public static void main (String args[])
	{
		LinkedHashMap m = new LinkedHashMap();
		m.put("Mohsin",10);
		m.put("Adil",20);
		m.put("Sanjay",30);
		m.put("Samad",40);
		System.out.println(m);
		System.out.println(m.put("Sanjay",50));
		
		Set s = m.keySet();
		System.out.println(s);
		Collection c  = m.values();
		System.out.println(c);
		Set s2 = m.entrySet();
		System.out.println(s2);
		
		Iterator itr = s2.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"........"+m1.getValue());
			if(m1.getKey().equals("Saqib"))
			{
				m1.setValue(60);
			}
		}
	}
}
