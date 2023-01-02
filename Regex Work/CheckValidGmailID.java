import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
class CheckValidGmailID
{
	public static void main(String args[]) {
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]* @gmail[.]com");
		Matcher m = p.matcher(args[0]);
		if(m.find() && m.group().equals(args[0])){
			System.out.println("Valid Mail Id");
	    }
		else {
			System.out.println("Invalid Mail Id");
		}
	
	}
} 