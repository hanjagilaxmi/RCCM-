package program;

import java.util.Scanner;

public class Stringscanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr String Size");
		int size=sc.nextInt();
		String[] a=new String[size];
		System.out.println("Enter String");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.next();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
