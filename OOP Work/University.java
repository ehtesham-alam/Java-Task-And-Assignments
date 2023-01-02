abstract class University {
	public void display()
	{
	 System.out.println("Sanjay");
	}
	abstract public void department();
}
class Student extends University
{
	public void department()
	{
		System.out.println("Computer Science");
	}
}
public class TestUniversity
{
	public static void main (String arg[])
	{
		Student st = new Student();
		st.display();
		st.department();
	}


}


