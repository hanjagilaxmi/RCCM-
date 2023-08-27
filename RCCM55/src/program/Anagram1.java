package program;

import java.util.Arrays;

public class Anagram1 {
	public static void main(String[] args) {
		String s="lax";
		String s1="xla";
		char[] a=s.toCharArray();
		char[] b=s1.toCharArray();
		if(a.length==b.length)
		{
			Arrays.sort(a);
			Arrays.sort(b);
			String s3=new String(a);
			String s4=new String(b);
			if(s3.equals(s4))
			{
				System.out.println("Anagaram");
			}
			else
			{
				System.out.println("not anagram");
			}		
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
