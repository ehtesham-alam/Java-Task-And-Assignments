class TimeP{
	public static void main(String str[]){
			int N = 7777777;
		long t;
		{
	StringBuilder sb = new StringBuilder();
	t = System.currentTimeMillis();
	for(int i=N; i --> 0;){
			sb.append("");
			
	}
		System.out.println(System.currentTimeMillis() - t);
	}
	{
	StringBuffer sf = new StringBuffer();
	
	t = System.currentTimeMillis();
	for(int i=N; i>0; i--){
			sf.append("");
			
	}
		System.out.println(System.currentTimeMillis() - t);
	
			
}
		}
		}