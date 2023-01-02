import java.util.*;  
class Example3{  
    public static void main(String[] args) {       
       List<String> list=new ArrayList<String>();  
       list.add("Sanjay");         
       list.add("Kumar");       
       list.add("Khatri");         
       list.add("Saqib");         
       list.add("Ali");                
       list.forEach(          
           // lambda expression        
           (names)->System.out.println(names)         
       );     
    }  
}