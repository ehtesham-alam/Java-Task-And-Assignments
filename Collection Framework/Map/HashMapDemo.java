import java.util.*;
class HashMapDemo
{
	public static void main (String args[])
	{
		HashMap m = new HashMap();
		m.put("Sanjay",700);
		m.put("Asad",800);
		m.put("Saqib",200);
		m.put("Samrat",500);
		System.out.println(m);
		System.out.println(m.put("Sanjay",1000));
		
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
				m1.setValue(10000);
			}
		}
	}
}
