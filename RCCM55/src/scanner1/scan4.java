package scanner1;

import java.util.Scanner;

public class scan4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
		System.out.println(s.charAt(i));
		}
	}

}
