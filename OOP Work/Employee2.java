class Employee2 
{
	String name = "Salu";
	int age = 2;
   }
Class PermanentEmployee extends Employee
{
	String name = "MUET";
    void Show() {
	System.out.println(super.name+"  "+age);
   }
   public static void main(String args[])
   {
     PermanentEmployee pe = new PermanentEmployee();
	 pe.show();
   }

 }
}
