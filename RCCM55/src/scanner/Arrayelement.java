package scanner;

import java.util.Scanner;

public class Arrayelement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
