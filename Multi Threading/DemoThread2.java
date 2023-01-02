class DemoThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try{
				Thread.sleep(1000);
			System.out.println(i+" "+ Thread.currentThread().getName());
			}catch(Exception e){
				e.printStackTrace();
			}
				
			}
	}
	

      public static void main(String [] args){
      DemoThread2 dt1=new DemoThread2();
      DemoThread2 dt2=new DemoThread2();
      DemoThread2 dt3=new  DemoThread2();

      dt1.start();
      try{
        dt1.join();
       }
	   catch(Exception e1){}

       dt2.start();
       dt3.start();
   }
}