class LoopProgram {
	
	public static void main(String args[])
	{
		for(int i=0;i<=10;i++) {
			
			for(int j=10;j<i+1;j--) {
				
				System.out.println("*");
		    }
			for(int k=0;k<=j-1;k++) 
			{
				System.out.println("*");
				
				
			}
				
		}
	}


}