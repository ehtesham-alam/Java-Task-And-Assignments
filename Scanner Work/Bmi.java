import java.util.Scanner;
class Bmi{
	public static void main(String str[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height in meters : ");
		int height = sc.nextInt();
		System.out.println("Enter Weight : ");
		int weight = sc.nextInt();
		
		int BMI = weight/(height*height);
			if(BMI < 25)
			System.out.println("Not a patient of BMI");
				else
				System.out.println("BMI Patient");
					}
		
			}