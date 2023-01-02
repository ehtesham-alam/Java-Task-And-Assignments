
 class SecondMax {
 
	public static void main(String[] args) {
 
		int arr[] = { 6, 2, 5, 9, 3, 1};
		int Max = arr[0];
		int secondMax = arr[0];
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > Max) {
				secondMax = Max;
				Max = arr[i];
 
			} else if (arr[i] > secondMax) {
				secondMax = arr[i];
 
			}
		}
 
		System.out.println("\nSecond Max number is:" + secondMax);
 
	}
}