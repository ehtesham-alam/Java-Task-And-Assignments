class CalculateMultiplication
{
	int b;
	int c;
	
	void multiplication() {
	
	System.out.println(b*c);
  }
  public static void main(String args[])
  {
		CalculateMultiplication cm = new CalculateMultiplication();
			
			cm.b = 3;
			cm.c = 5;
			cm.multiplication();
		CalculateMultiplication cm2 = new CalculateMultiplication();
			cm2.b = 5;
			cm2.c = 6;
			cm2.multiplication();
    }

}