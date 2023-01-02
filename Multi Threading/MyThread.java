class MyThread extends Thread
{
	public void run() 
	{
		System.out.println("Thread is running");
	 }
	 public static void main(String args[])
	 {
		Test thread  = new Test();
		thread.run();
	 }
}
