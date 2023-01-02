import java.util.regex.Pattern;
class Validation
{
 public static void main(String arg[])
 {
   System.out.println(Pattern.matches("[A-Z a-z][0-9]*\\s@gmail.com{1}","skkhatri948@gmail.com"));
 }

}