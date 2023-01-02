interface A
{
	void show();
}
class Main2
{
	public static void main(String args[])
	{
		A ob = new A({
			void show() {
			System.out.println("show");
		}
		});
	}
}
