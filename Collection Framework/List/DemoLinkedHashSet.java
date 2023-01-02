import java.util.*;
class DemoLinkedHashSet
{
	public static void main(String args[])
	{
		LinkedHashSet<Employee> hs=new LinkedHashSet<>();
		Employee e1=new Employee();
		e1.setName("Ali");
		e1.setAge(20);
		Employee e2=new Employee();
		e2.setName("Pawan");
		e2.setAge(22);
		
		hs.add(e1);
		hs.add(e2);
		
		

		
		//hs.removeAll(hs);
		//hs.remove(e1);
		
		
		for(Employee o:hs)
		{
			System.out.println(o.getName());
			System.out.println(o.getAge());
			System.out.println();
		}
	}
}