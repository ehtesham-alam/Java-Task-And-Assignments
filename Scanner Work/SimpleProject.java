import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

class SimpleProject
{
	public static void main(String args[]) {
		
		SimpleProject sp = new SimpleProject();
		sp.mainMenu();
	
	}
	
	public String currentMenu;

	Scanner ob = new Scanner(System.in);
	String choice;
	
	public void mainMenu() {
		
		System.out.println("      #### WELCOME TO CAFE MANAGEMENT SYSTEM ####\n");
		System.out.println("1-Fast FOOD CATEGORY");
		System.out.println("2-SPICY CATEGORY");
		System.out.println("3-DRINK CATEGORY");
		System.out.println("4-VIEW ALL ORDERS");
		System.out.println("5-EXIT \n");
		System.out.print("ENTER OPERATION NO: ");
		choice = ob.next();
		
		switch(choice) {
	    case "1" :
			fastFoodCategory();
		    break;
		case "2" :
			spicyCategory();
		    break;
		case "3" :
			drinkCategory();
			break;
		case "4" :
			viewAllOrders();
			break;
		case "5" :
			System.exit(0);
			break;
			
		default:
			System.out.println("\nYOU HAVE ENTERED WRONG OPERATION PLEASE RE-ENTER OPERATION\n");
			mainMenu();
			break;
			
	   }
		
	}
	
	public void customerOrder() {
		try {
			Scanner scan = new Scanner(System.in);
			
			String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
			Calendar calendar = Calendar.getInstance();
			
			File f1 = new File("RecordDetail.txt");
			f1.createNewFile();
			//System.out.println(f1.exists());
			
			FileWriter fw = new FileWriter("RecordDetail.txt",true);
			BufferedWriter bfr = new BufferedWriter(fw);
		
			System.out.println("Enter Customer Name :");
		    String cname = scan.nextLine();
			
			System.out.println("Enter Item Name :");
	 	    String item = scan.nextLine();
			
			System.out.println("Enter PRICE :");
		    String price = scan.nextLine();
			
			LocalDateTime current = LocalDateTime.now();
			DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
			String timeformatted = current.format(timeformatter);
			String dateformatted = current.format(dateformatter);
			
			System.out.println("Current Time is : "+timeformatted);
			System.out.println("Current Date is : "+dateformatted);	
            System.out.println("Current day = " + days[calendar.get(Calendar.DAY_OF_WEEK)-1]);
			
			bfr.write(cname+" 	" );
			bfr.write(item+" 	" );
			bfr.write(price+" 	" );
			bfr.write(timeformatted+" 	" );
			bfr.write(dateformatted+" 	" );
			bfr.write(days[calendar.get(Calendar.DAY_OF_WEEK)-1]+" 	 " );
			bfr.write("\n\n");
			bfr.close();
			System.out.println("Order Complete Successfully");
			backOption(choice);
	
		}
		catch(Exception e){
			
		}
		
	}
	
	 public void backOption(String param){
        System.out.print("\nPRESS Y FOR "+currentMenu.toUpperCase()+" AND N FOR TO GO BACK MAIN MENU\n");
        Scanner sc = new Scanner(System.in);
            switch(sc.nextLine().toLowerCase()) {
                case "y" :  if(currentMenu.equalsIgnoreCase("FASt_FOOD_CATEGORY"))
                                fastFoodCategory();
                            else if(currentMenu.equalsIgnoreCase("SPICY_CATEGORY"))
                                spicyCategory();
						    else if(currentMenu.equalsIgnoreCase("DRINK_CATEGORY"))
                                drinkCategory();
			             break;
				case "n" : mainMenu();
				           break;
			    default: 
                    System.out.println("\nYou HAVE ENTER WRONG CHARACTER PLEASE RE-ENTER YOUR CHARACTER\n");
                    backOption(param);
            } 
	 }
				
	
	public void fastFoodCategory() {
		currentMenu = "FASt_FOOD_CATEGORY";
		
		System.out.println("      #### WELCOME TO FAST FOOD CATEGORY ####\n");
		System.out.println("1-ZINGER");
		System.out.println("2-SANDWICH");
		System.out.println("3-FINGER CHIPS");
		System.out.println("4-PIZZA");
		System.out.println("5-ROLL");
		System.out.println("6-BACK");
		System.out.println("7-EXIT \n");
		System.out.print("ENTER OPERATION NO: ");
		choice = ob.next();
		
		switch(choice) {
	    case "1" :
			zinger();
		    break;
		case "2" :
			sandwich();
		    break;
		case "3" :
			fingerChips();
			break;
		case "4" :
			pizza();
			break;
		case "5" :
			roll();
			break;
		case "6" :
			mainMenu();
			break;
		case "7" :
			System.exit(0);
			break;
		default:
			System.out.println("\nYOU HAVE ENTERED WRONG OPERATION PLEASE RE-ENTER OPERATION\n");
			fastFoodCategory();
			break;
			
	   }
		
	}
	public void zinger() {
		customerOrder();
	}
	public void sandwich() {
		customerOrder();
	}
	public void fingerChips() {
		customerOrder();
	}
	public void pizza() {
		customerOrder();
	}
	public void roll() {
		customerOrder();
	}
	
	public void spicyCategory() {
		currentMenu = "SPICY_CATEGORY";
		
		System.out.println(" \n     #### WELCOME TO SPICY CATEGORY ####\n");
		System.out.println("1-CHICKEN TIKKA");
		System.out.println("2-CHICKEN MALAI");
		System.out.println("3-CHICKEN BOTI");
		System.out.println("4-CHICKEN BROAST");
		System.out.println("5-CHICKEN KASHMIRI");
		System.out.println("6-BACK");
		System.out.println("7-EXIT \n");
		System.out.print("ENTER OPERATION NO: ");
		choice = ob.next();
		
			switch(choice) {
	    case "1" :
			chickenTikka();
		    break;
		case "2" :
			chickenMalai();
		    break;
		case "3" :
			chickenBoti();
			break;
		case "4" :
			chickenBroast();
			break;
		case "5" :
			chickenKashmiri();
			break;
		case "6" :
			mainMenu();
			break;
		case "7" :
			System.exit(0);
			break;
		default:
			System.out.println("\nYOU HAVE ENTERED WRONG OPERATION PLEASE RE-ENTER OPERATION\n");
			spicyCategory();
			break;
			
	   }
		
	}
	
	public void chickenTikka() {
		customerOrder();
	}
	public void chickenMalai() {
		customerOrder();
	}
	public void chickenBoti() {
		customerOrder();
	}
	public void chickenBroast() {
		customerOrder();
	}
	public void chickenKashmiri() {
		customerOrder();
	}
	
	
	public void drinkCategory() {
		currentMenu = "DRINK_CATEGORY";
		
		System.out.println(" \n     #### WELCOME TO DRINK CATEGORY ####\n");
		System.out.println("1-TEA");
		System.out.println("2-COFFEI");
		System.out.println("3-GREEN TEA");
		System.out.println("4-COLDRINK");
		System.out.println("5-JUICE");
		System.out.println("6-BACK");
		System.out.println("7-EXIT \n");
		System.out.print("ENTER OPERATION NO: ");
		choice = ob.next();
		
		switch(choice) {
	    case "1" :
			tea();
		    break;
		case "2" :
			coffei();
		    break;
		case "3" :
			greenTea();
			break;
		case "4" :
			coldrink();
			break;
		case "5" :
			juice();
			break;
		case "6" :
			mainMenu();
			break;
		case "7" :
			System.exit(0);
			break;
		default:
			System.out.println("\nYOU HAVE ENTERED WRONG OPERATION PLEASE RE-ENTER OPERATION\n");
			drinkCategory();
			break;
			
	   }
		
	}
	public void tea() {
		customerOrder();
	}
	public void coffei() {
		customerOrder();
	}
	public void greenTea() {
		customerOrder();
	}
	public void coldrink() {
		customerOrder();
	}
	public void juice() {
		customerOrder();
	}
	
	public void viewAllOrders() {
		try{
			FileReader fr = new FileReader("RecordDetail.txt");
			BufferedReader bfr = new BufferedReader(fr);
			String line = bfr.readLine();
			while(line != null) {
				
				System.out.println(line);
				line = bfr.readLine();
			}
			bfr.close();
			
	    }catch(Exception e){}
		
		
		
		
	}
	





}