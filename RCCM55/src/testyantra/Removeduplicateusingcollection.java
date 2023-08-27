package testyantra;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicateusingcollection 
{
	public static void main(String[] args) 
	{
		String s = "Testyantra in Bangalore";

		char[] c1 = s.toCharArray();
		Set<Character> t = new LinkedHashSet<Character>();
		for (char c : c1)
		{
		    t.add(c);
		}
		String re=""; 
		for (Character ch : t) 
		{
			re += ch;
		}
		System.out.println(re);	   
	}
}
