package program;

import java.util.Scanner;

public class Arrayscanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
