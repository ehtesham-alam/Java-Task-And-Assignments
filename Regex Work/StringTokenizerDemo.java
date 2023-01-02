import java.util.*;
class StringTokenizerDemo
{
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("Durga Software Solution");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
	    }
	}
} 