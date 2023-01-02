import java.util.regex.Matcher;
import java.util.regex.Pattern;
class CharacterDemo
{
	public static void main(String args[]) {
		//Pattern p = Pattern.compile("[abc]");
		Pattern p = Pattern.compile("[^abc]");
		//Pattern p = Pattern.compile("[a-z]");
		//Pattern p = Pattern.compile("[0-9]");
		//Pattern p = Pattern.compile("[a-zA-Z0-9]");
		//Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("a7b@z#9");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
	    }
	
	}
}