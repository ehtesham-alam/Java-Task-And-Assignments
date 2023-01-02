import java.util.*;

class JavaProject
{
	public static void main(String arg[]) {
		JavaProject jp = new JavaProject();
		jp.mainMenu();
	}
	
	Scanner ob = new Scanner(System.in);
	String choice;
	
	public void mainMenu() {
	    System.out.println("           ### MINI PROJECT ###\n");
		System.out.println("1-If");
		System.out.println("2-Loops");
		System.out.println("3-Classes & Object");
		System.out.println("4-Access Specifiers");
		System.out.println("5-Constructor");
		System.out.println("6-Inheritance");
		System.out.println("7-Encapsulation");
		System.out.println("8-Polymorphism\n\n");
		System.out.print("Enter Your Operation No: ");
		choice=ob.next();
			
		switch(choice) {
			case "1":
				iF();
				break;
			case "2":
				loops();
				break;
			case "3":
				classesObject();
				break;
			case "4":
				accessSpecifiers();
				break;
			case "5":
				constructor();
				break;
			case "6":
				inheritance();
				break;
			case "7":
				encapsulation();
				break;
			case "8":
				polymorphism();
				
			default:
			    System.out.println("\nYOU HAVE ENTERED WRONG OPERATION PLEASE RE-ENTER OPERATION\n");
			    mainMenu();
			break;
				
			}
		}
		public void iF() {

		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Email = ");
		String email=ob.nextLine();
		System.out.print("Enter Password = ");
		String pass=ob.nextLine();
		
		if(email.equals("skkhatri948@gmail.com")&&pass.equals("khatri123"))
		{
			javax.swing.JOptionPane.showMessageDialog(null,"You are Successfully Login!");
		}
		else
		{
			javax.swing.JOptionPane.showMessageDialog(null,"Invalid Email/Password");
		}
			
	}
		
		public void loops() {
	    System.out.println("           ### WELCOME TO LOOP PROGRAMS ###\n");
		System.out.println("1-FOR()");
		System.out.println("2-WHILE()");
		System.out.println("3-DO-WHILE");
		System.out.println("4-BACK");
		System.out.println("Enter Your Operation No: ");
		choice=ob.next();
			
		switch(choice) {
			case "1":
				fOr();
				break;
			case "2":
				While();
				break;
			case "3":
				doWhile();
				break;
			case "4":
				mainMenu();
				
			default:
			    System.out.println("\nYOU HAVE ENTERED WRONG OPERATION PLEASE RE-ENTER OPERATION\n");
			break;
				
			}
		}
		public void fOr() {
	    int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+"   ");
			}
			System.out.println();
			a++;
		}
			
	}	
		
		public void While() {
		int num=15;
		int fact=1;
		int a=1;
		while(num<=1)
		{
		while(a<=num)
			fact=fact*a;
			a++;
		}
		System.out.println("factorial : " +fact);
		num++;
			
		}
		
		public void doWhile() {
		int p=54321;
	    int i=0;
	    do
	   {
			System.out.println(p);
			p=p/10;
			i++;
	   }
	   while(i<5);
			
	}
			
			
	  /* public void classesObject() {
			
		}
			
		public void accessSpecifiers() {
			
			
		}
		
		public void constructor() {
			
			
			
		}
		
		public void inheritance() {
	
			
		}
		
		public void encapsulation() {
			
			
			
			
		}
		
		public void polymorphism() {
			
			
		}*/
}       
