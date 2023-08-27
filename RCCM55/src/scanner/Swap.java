package scanner;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a 1st number");
		int b=a.nextInt();
		System.out.println("Enter a 2nd number");
		int c=a.nextInt();
		System.out.println("Swapping Numbers");
		int d=b;
		b=c;
		c=d;
		System.out.println(b);
		System.out.println(c);
	}
}
