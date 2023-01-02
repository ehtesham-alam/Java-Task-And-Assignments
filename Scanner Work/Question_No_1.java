class Question_No_1 
{
	public static void main(String args[]) {
	
	String str = "  one  !  two  ! three.  ";
	
	System.out.println("Space : "+onlyCharacter(str));
  }
	
  public static int onlyCharacter(String string) {
  
	int countSpace = 0;
	for(char c : string.toCharArray()) {
		if(c == ' ') {
			countSpace++;
		}
	}
  return countSpace;
  
  }


}