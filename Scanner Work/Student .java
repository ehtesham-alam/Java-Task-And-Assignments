class Student 
{
	String name;
	int age;
	
	public Student(String x,int y) {
		
		 name = x;
		 age = y;
	}
	public void show(){
	
		System.out.println(name);
		System.out.println(age);
		System.out.println("====================");
	
	}
	public static void main(String arg[]) {
	Student st = new Student("Sanjay",20);
	st.show();
  }
}