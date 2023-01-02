import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Bank
{
	private String accno;
	private String name;
	private long balance;
	public int rand_int1;
	

	Scanner ob = new Scanner(System.in);
	
	//method to open an account
	public void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno = ob.next();
		System.out.print("Enter Name: ");
		name = ob.next();
		System.out.print("Enter Balance: ");
		balance = ob.nextLong();
		System.out.println("Account Create Successfully....\n ");
	}

	//method to display account details
	public void showAccount()
	{ 
		System.out.println("Account No :         Name :            Balance :\n");
		System.out.println(accno+"               "+name+"             "+balance+"\n");
	}

	//method to deposit money
	public void deposit()
	{
		long amt;
		System.out.println("Enter Amount you Want to Deposit : ");
		amt = ob.nextLong();
		balance=balance+amt;
		System.out.println("Amount Deposit Successfully.....\n ");
	}

	//method to withdraw money
	public void withdrawal() {
	try {
			
			File f1 = new File("TranctionDetail.txt");
			f1.createNewFile();
			//System.out.println(f1.exists());
			
			FileWriter fw = new FileWriter("TranctionDetail.txt",true);
			BufferedWriter bfr = new BufferedWriter(fw);
			
			int amt;
			System.out.println("Enter Amount you Want to withdraw : ");
			amt = ob.nextInt();
			
			LocalDateTime current = LocalDateTime.now();
			DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
			String timeformatted = current.format(timeformatter);
			String dateformatted = current.format(dateformatter);
			
			
			
			if(balance>=amt)
			{ 
				balance=balance-amt;
				
				System.out.println("Current Time is : "+timeformatted);
			    System.out.println("Current Date is : "+dateformatted);	
				System.out.println("Traction Successfully...\n");	
				
				bfr.write("Account No :             Name :             Balance :                 Time :              Date : \n\n");
				bfr.write(accno+"                     ");
				bfr.write(name+"                  ");
				bfr.write(amt+"                    ");
				bfr.write(timeformatted+"          " );
			    bfr.write(dateformatted+"       " );
				bfr.write("\n\n");
			    bfr.close();
				
			}
			else
			{
				System.out.println("Less Balance..Transaction Failed..\n");
			}
	}
	catch(Exception e) {
		
	}

 }
	//method to search an account number
	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}	

class BMS
{  
	public static void main(String arg[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.print("                #### WELCOME TO BANK MANAGEMNET SYSTEM ####\n\n ");
		
		//create initial accounts
		System.out.print("How Many Customer you Want to Input : ");
		int n = ob.nextInt();
		Bank  b[]=new Bank[n];
		for(int i=0;i<b.length;i++)
		{   
			b[i]=new Bank();
			b[i].openAccount();
		}
		
		//run loop until menu 6 is not pressed
		int ch;
		do
		{
			System.out.println("1-Display All");
			System.out.println("2-Search By Account");
			System.out.println("3-Deposit");
			System.out.println("4-Withdrawal");
			System.out.println("5-Tranction Detail");
			System.out.println("6-Exit\n");
			
			System.out.print("Enter your Choice :");
			ch = ob.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<b.length;i++)
					{
						b[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No you Want to Search...: ");
					String acn = ob.next();
					boolean found=false;
					for(int i=0;i<b.length;i++)
					{  
						found = b[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..\n");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn = ob.next();
					found=false;
					for(int i=0;i<b.length;i++)
					{  
						found = b[i].search(acn);
						if(found)
						{
							b[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..\n");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acn = ob.next();
					found=false;
					for(int i=0;i<b.length;i++)
					{  
						found = b[i].search(acn);
						if(found)
						{
							b[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..\n");
					}
					break;

				case 5:
					try{
						FileReader fr = new FileReader("TranctionDetail.txt");
						BufferedReader bfr = new BufferedReader(fr);
						String line = bfr.readLine();
						while(line != null) {
							
							System.out.println(line);
							line = bfr.readLine();
						}
						bfr.close();
						
					}catch(Exception e){}
					
					break;
				case 6:
					System.out.println("Good Bye...");
					break;
			}
		}
		while(ch!=6);
	}
}
	
