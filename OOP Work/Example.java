class Example{
	public void func(String name, String gender){
		if(gender.equals("Male")){
			System.out.println("Mr : " +name);
				}else if(gender.equals("Female")){
			System.out.println("Mrs : " +name);
						}
		
			
				}
public static void main(String[] str){
	Example ex = new Example();
		ex.func("Sanjay","male");
		
		}		
			}
			
