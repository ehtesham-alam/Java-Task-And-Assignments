class StringExample2 
{
   public static void main(String[] args) 
   {
	 String str = "My name is        sanjay kumar khatri";
		
	//length of the String
	System.out.println("Length of the String: "+str.length());
		
	//length of the String without white spaces
	System.out.println("Length of String without spaces: "+str.replace(" ", "").length());
   }
}