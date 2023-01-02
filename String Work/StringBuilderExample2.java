class StringBuilderExample2 { 
    public static void main(String[] args) 
    { 
  
        StringBuilder str = new StringBuilder("SanjayKumar"); 
  
        System.out.println("Before removal String = "+ str.toString()); 
  
        StringBuilder afterRemoval = str.deleteCharAt(8); 
   
        System.out.println("After removal of character"+ " at index 8 = " + afterRemoval.toString()); 
    } 
} 