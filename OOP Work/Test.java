class Account {
	private int balance;
	private String accountName;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

class Test {
	public static void main(String arg[]) {
		Account ob = new Account();
		ob.setBalance(500);
		System.out.println(ob.getBalance());
		System.out.println();
	}
}