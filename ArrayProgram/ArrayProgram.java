class ArrayProgram 
{
	public static void main(String arg[]) {
	 int []value={60,20,99,100,85};
	 int mini = value[0];
	 for(int i=0;i<value.length;i++) {
		if(mini > value[i]){
			mini = value[i];
		}
		 
	}
	System.out.println("mini: " + mini );
 }
 
 }