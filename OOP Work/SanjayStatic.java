class SanjayStatic {
	static int count = 100;
	int vip = 50;
	public static void main(String arg[]) {
		
		SanjayStatic ob = new SanjayStatic();
		
		SanjayStatic ob1 = new SanjayStatic();
		
		System.out.println(ob.count+" ob count old value");
		System.out.println(ob.vip+" ob vip old value");
		
		System.out.println(ob1.count+" ob1 count old value");
		System.out.println(ob1.vip+" ob1 vip old value");
		
		ob.vip = 70;
		ob.count = 20;
		
		System.out.println(ob.count+" ob count new value");
		System.out.println(ob.vip+" ob vip new value");
		
		System.out.println(ob1.count+" ob1 count new value");
		System.out.println(ob1.vip+" ob1 vip new value");
		
		
	}
}