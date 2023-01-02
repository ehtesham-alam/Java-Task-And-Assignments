class MaxMiniAverage
{
	public static void main (String arg[]) {
	int max = 0;
	int min = 0;
	int sum = 0;
	int[] a={50,80,2,1,0,150};
	for(int i=0;i < a.length;i++) {
	
		sum += a[i];
		if(min > a[i]) {
		   min = a[i];
		}
		if(max < a[i]) {
		   max = a[i];
		}
	}
	double average = (double) sum /a.length;
	
	System.out.println(" min: " +min);
	System.out.println(" max: " +max);
	System.out.printf("average: %.1f",average);
  
  }

}