import java.util.regex.Pattern;
class PatternSplitDemo
{
	public static void main(String args[]) {
		Pattern p = Pattern.compile("\\s");
		//Pattern p = Pattern.compile("\\.");      // \\"[.]" And "\\." Both are same
		String[]s = p.split("Durga Software Solution");
		//String[]s = p.split("www.durgajobs.com");
		for(String s1 :s) {
			System.out.println(s1);
	    }
	
	}
} 