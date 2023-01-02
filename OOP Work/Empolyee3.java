class Empolyee3
{
	String name = "Salu";
	int age = 2;
	double salary;
	//public static void main(String arg[]) {
		{
		this.name = name;
		this.age = age;
	   }
}
class PEmployee extends Empolyee3
{
	//duble salary;
	public PEmployee(String name,int age,double salary)
	{
		//this.(name,age);
		this.name = name;
		this.age = age;
		this.salary = salary;
	 }
	public void show() {
	System.out.print("name"+name+"age"+age+"salary"+salary);
  }
 public static void main(String arg []) {
	PEmployee e = new  PEmployee("sid",1,22.2);
	e.show();
 }
}



