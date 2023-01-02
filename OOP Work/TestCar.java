abstract class Car {

	public abstract void color();
	public void Tyre()
	{
	 System.out.println("Four Tyre");
	}
	public abstract void Gair();
  }
  class GLI extends Car {
  public void color()
  {
	System.out.println("Black");
  }
  public void Gair()
  {
	System.out.println("Five Gair");
  }
 }
  public class TestCar 
  {
		public static void main(String args[]) {
		GLI gli = new GLI();
		
		gli.Tyre();
		gli.color();
		gli.Gair();
	}
 }

