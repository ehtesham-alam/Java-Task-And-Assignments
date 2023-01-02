import java.util.*;

class Program
{
	public static void main(String[] args)
	{
		String peragraph = "Woh !! how wow are you.\nMicrosoft is a Good compony. \nI teach At geeks academy How are @ ? \nWHAT $ are you 786 doing. How doog\n\n";
		int option;
		
		System.out.println(peragraph);
		option=Program.Manu();
		
		switch(option)
		{
			case 1:  Program.Search();
				break;
				
			case 2: 
				break;
			case 3: 
				break;
			case 4: 
				break;
			case 5: 
				break;
			case 6: 
				break;
			case 7: 
				break;
			case 8: 
				break;
				
			default:
				System.out.println("Sorry invalid selection.....");
		}
	}
	
	static int Manu()
	{
		Scanner scan = new Scanner(System.in);
		int option;
		
		System.out.println("   ### WELCOME To String World ###\n\n");
		System.out.println("1-Search a Word");
		System.out.println("2-Replace a Word");
		System.out.println("3-Convert a Word into UperCase/LowerCase");
		System.out.println("4-Find Polindrom");
		System.out.println("5-Validate Phone Number");
		System.out.println("6-Validate Email");
		System.out.println("7-Reverse Each Word");
		System.out.println("8-Analize Peragraph\n\n");
		System.out.print("Enter Any Operation :");
		option=scan.nextInt();
		
		return option;
		
	}
	
	static void Search()
	{
		Scanner scan = new Scanner(System.in);
		String word;
		System.out.println("Enter a Word");
		word=scan.next();
		
		if(peragraph.contains(word))
			
		
		
	}
	
}