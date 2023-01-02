abstract class Animal{

	public abstract void sound();
	public void eyes()
	{
		System.out.println("Two eyes");
	}
	public abstract void ears();
	public abstract void legs();

  }
    class Cat extends Animal {
	public void sound()
	{
	
		System.out.println("Meow Meow...");
	}
	
	public void ears()
	{
		System.out.println("Two ears");
	}
	
	public void legs() 
	{
		System.out.println("Four legs");
	}
}
    class Dog extends Animal {
	public void sound()
	{
		System.out.println("wow wow...");
	}
	
	public void ears()
	{
		System.out.println("Two ears");
	}
	
	public void legs()
	{
		System.out.println("Four legs");
	}

}
   public class TestAnimal
{
	public static void main(String args[]) {
	Cat cat = new Cat();
	Dog dog = new Dog();
	
	cat.eyes();
	dog.eyes();
	cat.sound();
	dog.sound();
	cat.ears();
	dog.ears();
	cat.legs();
	dog.legs();
  }

}


