abstract class Shape{
   public void display(){
     System.out.println("This is display method");
   }
   abstract public void calculateArea();
}
class Square extends Shape
{
	public void calculateArea()
	{
		
		System.out.println("Five Hundred Square Foot");
	}
}
public class Rectangle {
   public static void main(String args[])
   {
	   Square sqr = new Square();
	   sqr.display();
	   sqr.calculateArea();
     
  }
 
}