package program;

import java.util.Scanner;

public class Validpassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
			//char ch=s.charAt(i);
//			if(ch!=' '&&s.length()>=8||s.length()<=15&&ch>=48||
//					ch<=57&&ch>=65||ch<=90&&ch>=97||ch>=122&&ch=='@'
//					||ch=='#'||ch=='%'||ch=='&'||ch=='!'||ch=='$')
			if(s.matches(".*[0-9]{1,}.*") && s.matches(".*[@#$!&%]{1,}.*")
					&&s.length() >=8 && s.length()<=15&&s.matches(".*[A-Z]{1,}.*")
					&&s.matches(".*[a-z]{1,}.*"))
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("invalid");
			}
		//}
	}
}
