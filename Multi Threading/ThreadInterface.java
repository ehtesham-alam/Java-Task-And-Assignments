class ThreadInterface implements Runnable 
{
	public ThreadInterface()
	{
	  System.out.println("Thread Created");
	}
	public void run()
	{
	  System.out.println("Thread is Running");
	}
	public static void main(String arg[])
	{
	  ThreadInterface dt = new ThreadInterface();
	  Thread t = new Thread(dt);
	  t.start();
	
	}
	



}