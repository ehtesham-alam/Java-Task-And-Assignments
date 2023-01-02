import java.util.regex.Pattern;
class StringSplitDemo
{
	public static void main(String args[]) {
		String s = "Durga Software Solution";
		String[]s1 = s.split("\\s");
		for(String s2 :s1) {
			System.out.println(s2);
	    }
	
	}
} 