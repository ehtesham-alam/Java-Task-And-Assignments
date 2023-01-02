class Student
{
	String name;
	static String depart;
	public static void main(String arg[])
	{
		Student st = new Student();
				st.name = "Aslam";
				st.depart = "BBA";
	    Student st2  = new Student();
				 st2.name = "Javed";
				 st2.depart = "IT";
		System.out.println(st.name +"  "+depart);
		System.out.println(st2.name +"  "+depart);
	}
}