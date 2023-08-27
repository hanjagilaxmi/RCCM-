package scanner1;

import java.util.Scanner;

public class scan3 {
	static void tab(int no)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+" * "+i+" = "+(no*i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		//for(int j=no;j<=100;j++) {
		tab(no);
		//}
	}

}
