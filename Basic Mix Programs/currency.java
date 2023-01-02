class currency
{
	public static void main(String args[]){
	int amount = 4760;
	int thousand = amount/1000;
        amount = amount%1000;
        System.out.print("thousand = ",+1000);
        int fivehundred = amount/500;
        amount = amount%500;
        System.out.print("five hundred = ",+500);
	int hundred = amount/100;
        amount = amount%100;
        System.out.print("hundred = ",+100);
        int fifty = amount/50;
        amount = amount%50;
        System.out.print("fifty = ",+50);
	int ten = amount/10;
        amount = amount%10;
	System.out.print("ten = ",+10);
	}
}