class Volume  
{ 
     public static void main(String args[])  // Tight Coupling Program
     { 
         Box b = new Box(5,5,5); 
         System.out.println(b.volume); 
     } 
} 
class Box  
{ 
     public int volume; 
	 //Box b = new Box(5,5,5); 
     Box(int length, int width, int height)  
     { 
         this.volume = length * width * height; 
     } 
} 


