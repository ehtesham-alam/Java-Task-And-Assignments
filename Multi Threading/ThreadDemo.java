class ThreadDemo extends Thread
{
	public ThreadDemo() 
	{
	  System.out.println("Thread is Created");
	}
	public void run()
	{
		try{
	  System.out.println("Thread is Running");
		}catch(Exception e){}}
	public static void main(String arg[])
	{
		ThreadDemo td  = new ThreadDemo();
		td.start();
		//td.getName();
		//td.setName("Sid");
		//td.start();
	}
}