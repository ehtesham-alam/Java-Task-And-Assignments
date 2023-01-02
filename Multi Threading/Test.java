class Test implements Runnable
{
	public void run() {
	
	System.out.println("Thred is running");
	}
	public static void main(String args[])
	{
		Test t = new Test();
		Thread thread  = new Thread(t);
		thread.run();
	}

}