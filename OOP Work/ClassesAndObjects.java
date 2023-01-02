class Student
{
	String name;
	String surname;
	String rollno;
	
	void display()
	{
		System.out.println(name);
		System.out.println(surname);
		System.out.println(rollno);
		
	}
}

class ClassesAndObjects
{
	public static void main(String arg[])
	{
		Student ob1=new Student();
		Student ob2=new Student();
		
		ob1.name="Sanjay";
		ob1.surname="Khatri";
		ob1.rollno="2k18/cse/106";
		
		System.out.println("First Student Bio Data :");
		System.out.println(ob1.name);
		System.out.println(ob1.surname);
		System.out.println(ob1.rollno);
	
	}
}