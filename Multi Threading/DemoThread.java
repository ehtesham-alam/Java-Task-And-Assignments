class MyThread extends Thread {
	public void run() {
		for(int i = 1; i<=20; i++) {
			System.out.println("i = "+i+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		}
	}
}
class DemoThread {
	public static void main(String arg[]) {
		
		MyThread t = new MyThread();
		//t.run();
		t.start();
		for(int i = 1; i<=50; i++) {
			System.out.println("i = "+i);
		}
		for(int i = 50; i<=100; i++) {
			System.out.println("i = "+i+"----------------");
		}
	}
}
