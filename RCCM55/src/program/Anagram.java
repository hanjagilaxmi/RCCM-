package program;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="Madam";
		String s2="maadM";
		char[] ch=s1.toCharArray();
		char[] ca=s2.toCharArray();
		
		if(ch.length==ca.length)
		{
			Arrays.sort(ch);
			Arrays.sort(ca);
			String s3=new String(ch);
			String s4=new String(ca);
			if(s3.equals(s4))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not Anagram");
			}
			
		}
		else
		{
			System.out.println("not Anagram");
		}
	}

}
