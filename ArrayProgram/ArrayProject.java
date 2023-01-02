import java.util.*;
class ArrayProject
{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		int []arr=null;
		int a=0;
		int choice=0;
		do
		{   System.out.println("           ### WELCOME TO ARRAY ###\n");
			System.out.println("1-Enter Array Length");
			System.out.println("2-Enter Element in Array");
			System.out.println("3-Find the Second Largest in Array");
			System.out.println("4-Find the Second Lowest in Array");
			System.out.println("5-Find the Average");
			System.out.println("6-Sort Array in Ascending Order");
			System.out.println("7-Sort Array in Descending Order");
			System.out.println("8-Search Element in Binary Search\n\n");
			System.out.print("Enter Your Operation No: ");
			choice=ob.nextInt();
			switch(choice)
			{
				case 1:
						 System.out.println("Enter Array Length");
						 a=ob.nextInt();
				         arr=new int[a];
				         break;
				
				case 2:
				         System.out.println(" Enter " + a + " Elements in Array ");
				         for(int i=0;i<arr.length;i++)
				         {
					        arr[i]=ob.nextInt();
				          }
				          break;
				
				
		        case 3:
						  int Max=0;
						  int secondMax=0;
		                  for (int i = 0; i < arr.length; i++) {
 
			              if (arr[i] > Max) {
				          secondMax = Max;
				          Max = arr[i];
			             } 
	                      else if (arr[i] > secondMax) {
				          secondMax = arr[i];
				         }
		               }
                       System.out.println("\nSecond Largest number is:" + secondMax);
		               break;
			    case 4:
						  int Mini = 1000;
						  int secondMini = 1000;
		                  for (int i = 0; i < arr.length; i++) 
						  {
							if(arr[i]==Mini)
							{
							  secondMini=Mini;
							} 
							else if (arr[i] < Mini) 
							{
								secondMini = Mini;
								Mini = arr[i];
							 } 
							else if (arr[i] < secondMini) 
							{
							   secondMini = arr[i];
							 }
						 }
		                 System.out.println("second Lowest number is:"+secondMini);
				         break;
				case 5:
						  int max = 0;
	                      int min = 0;
						  int sum = 0;
						  for(int i=0;i < arr.length;i++) {
							sum += arr[i];
							if(min > arr[i]) {
							min = arr[i];
						  }
							if(max < arr[i]) {
							max = arr[i];
						  }
	                    }
						double average = (double) sum /arr.length;
				 
						System.out.printf("\naverage: %.1f",average);
				        break;
				case 6:
						
						   int y;
						   int temp=0;
						   for(int i=0;i<arr.length;i++)
							{
								y=i;
								for(int j=i+1;j<arr.length;j++)
								{
									if(arr[j] < arr[y])
									{
									   y=j;
									 }
								 }
								 temp=arr[i];
								 arr[i]=arr[y];
					             arr[y]=temp;
								}
								for(int i=0;i<arr.length;i++)
								{
									System.out.println(arr[i]+" ");
								 }
					              break;
				case 7:
							int k,l=0;
							for(int i=0;i<arr.length;i++)
							{
								k=i;
								for(int j=i+1;j<arr.length;j++)
								{
									if(arr[j] > arr[k])
									{
									  k=j;
									}
								}
								l=arr[i];
								arr[i]=arr[k];
								arr[k]=l;
							}
								for(int i=0;i<arr.length;i++)
								{
								  System.out.println(arr[i]+" ");
								}
								break;
				case 8:
								int srch=2;
								int r=0;
								int h=arr.length-1;
								int m=(r + h)/2;
		
								while(r <= h)
								{
									if(arr[m]==srch)
									{
										System.out.println("element is at "+m+" index position");
										break;
									 }
									 else if(arr[m]<srch)
									 {
										r = m+1;
									  }
									 else
									 {
										h = m-1;
									  }
									  m=(r+h)/2;
									}
									if(r>h)
									{
										System.out.println("element not found");
										break;
									 }
			default:
		    System.out.println("No match Choice");
		}
	 }
		while(choice!=8);
    }

}

