class Animal 
{

}
class Monkey extends Animal {


}
class OverloadedDemo5
{
	public void m1(Animal a)
	{
	  System.out.println("Animal_Version");
	}
	public void m1(Monkey m)
	{
	  System.out.println("Monkey_Version");
	}
	public static void main(String arg[])
	{
		OverloadedDemo5 old = new OverloadedDemo5();
		Animal a = new Animal();
		old.m1(a);
		Monkey m  = new Monkey();
		old.m1(m);
		Animal a1 = new Monkey();
		old.m1(a1);
	}

}