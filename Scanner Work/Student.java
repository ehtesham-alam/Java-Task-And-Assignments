class Student {

	String name;
	int rollno;
		Student(String name , int rollno)
		{
			this.name = name;
			this.rollno = rollno;
		
		}
		public static void main(String args[])
		{
			Student s = new Student("Sanjay" ,106); 

				System.out.println(s.name +"..."+ s.rollno);
		
		
		}
 




}