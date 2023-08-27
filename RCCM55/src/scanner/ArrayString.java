package scanner;

import java.util.Scanner;

public class ArrayString
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String Size");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
