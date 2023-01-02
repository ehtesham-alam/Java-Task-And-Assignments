import java.util.regex.Pattern;
class RegixDemo
{
	public static void main(String args[])
	{
	 System.out.println(Pattern.matches("\\d","abc"));
	 System.out.println(Pattern.matches("\\d","1"));
	 System.out.println(Pattern.matches("\\D*","mark"));
	 System.out.println(Pattern.matches("[amn]+","a"));
	 System.out.println(Pattern.matches("[amn]+","aazzta"));
	 System.out.println(Pattern.matches("[amn]?","aaa"));
	 System.out.println(Pattern.matches("[amn]*","ammna"));
   }
}