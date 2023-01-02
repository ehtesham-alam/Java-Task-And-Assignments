import java.util.*;
import java.SimpleDateFormat;

class TimeThread extends Thread
{
	String s;
	SimpleDateFormat f;
	public void run(){
	
	try {
		while(true)
		{
			Date d=new Date();
			f=new SimpleDateFormat("hh:mm:ss");
			s=f.farmat(d);
			System.out.println(s+"\r");
		 }
	}
		
 	}catch(Exception e) {
		e.printStackTrace();
		}
    public static void main(String arg[])
	{
		TimeThread th = new TimeThread();
		th.start();
	}
}