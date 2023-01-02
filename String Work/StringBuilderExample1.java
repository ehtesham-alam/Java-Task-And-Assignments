class StringBuilderExample1 
{ 
    public static void main(String[] args) 
    { 
       StringBuilder str = new StringBuilder("Sanjay Khatri"); 
  
       System.out.println("String = "+ str.toString());
	   
       StringBuilder strReturn = str.replace(7,7, "Kumar "); 
  
       System.out.println("After Replace() String = "+ strReturn.toString());    
    } 
} 