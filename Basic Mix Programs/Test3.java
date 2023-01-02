class Test
{
	int x;
	int y;
	swap(Test){
	int temp = t.x;
	t.x = t.y;
	t.y = temp;
  }
  public static void main (string args[]){
  Test test = new Test();
  test.x=30;
  test.y=40;
  test.swap(test);
  System.out.println(test.x);
  System.out.println(test.y);
 }
}