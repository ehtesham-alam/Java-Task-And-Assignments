import java.util.Scanner;
import java.util.Random;
class HangmanGame{
	public static void main(String args[]){
	String []words={"come", "get", "give", "keep", "let", "make", "put", "seem", "take", "have"
	, "see", "send", "may", "will","about", "across", "after", "against", "among", "before", "between",
	 "down","from","off","over","through","under","with","till", "than","the","all", "any","every",
	 "other","some","such", "that","you","who","because", "but","though","how","very", "tomorrow",
	 "when", "where", "why", "again", "ever", "far", "forward","much","not","only","quite",
	"here", "near","still","then", "there", "together", "well", "almost", "enough", "even", "little",
	"yesterday","north","south","east","west","please","yes"};
	Scanner obj=new Scanner(System.in);
	Scanner obj1=new Scanner(System.in);
	char ch='n';
	System.out.println("************    Welcome to Hangsman Game    ***************************");

	do{
		System.out.println("Please Select an Option From Following");
		System.out.println("1.Start The Game");
		System.out.println("2.Need Help");
		System.out.println("3.Quit");
		System.out.println("Enter Your Choice");
		int select=obj1.nextInt();
		if(select==1){
			System.out.println("Let's Start Game");
	int rand=(int) (Math.random()*words.length);
	String guess="";
	int lngth=words[rand].length();
	System.out.println("Your Guessing word Contains "+lngth+"  letters ");
	for(int i=0;i<lngth;i++){
			System.out.print("_ ");
		guess=guess.concat("_");
		}
		System.out.println();
		System.out.println("Enter Your Word!!");
		String check=obj.nextLine();
		if(check.equals(words[rand])){
			System.out.println("Your Guessing Word is Correct");
			}
			else{
				System.out.println("Your Guessing Word is Wrong!!!");
					int count=0;
				while(guess!=words[rand]&&count<lngth/2){
				System.out.println("Hint "+(count+1));
				int hint=(int)(Math.random()*lngth);
				char hint1=words[rand].charAt(hint);
					guess=replaceAt(hint,hint1,guess);
					System.out.println("Your Hint is ");
					System.out.println(guess);
					System.out.println("Enter Your WOrd Again!!");
					String chck=obj.nextLine();
					if(chck.equals(words[rand])){
							System.out.println("You Have Guesed Correct!!");
							break;
						}
					else{
							System.out.println("You Have Guessed Wrong!!");
						}
						count++;
				}//while Loop
			System.out.println("The WOrd is  "+words[rand]);
			}//else body closed
	}//if body closed
		else if(select==2){
				System.out.println("This Game is whole About Guessing Word");
				System.out.println("In this Game You Will be Provided with the number of Letter ");
				System.out.println("Provided in the Guessing Word and you Have to Guess That Word!!");
				System.out.println("Example:\n\t\tYour Guessing Word contains 3 letters \n\t\tand you have to Guess Word Like try,boy,fly,etc");
				System.out.println("Best Of Luck!!!");

			}
			else{
				System.out.println("Exited from the Game");
				System.exit(0);
				}
		System.out.println("DO you Want to Continue y/n");
		 ch=obj.nextLine().charAt(0);

		}while(ch!='n');
		System.out.println("THANKS for Playing Game");

	}//main Method
	public static String replaceAt(int index,char ch,String str){
		StringBuffer strb=new StringBuffer(str);
		strb.setCharAt(index,ch);
		String strr=new String(strb);
		return strr;
		}

}