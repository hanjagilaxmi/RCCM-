package scanner1;

import java.util.Scanner;

public class scan2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		while(no!=0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				System.out.println(rem+" Even ");
			}
			else
			{
				System.out.println(rem+" Odd ");
			}
			no=no/10;
		}
	}

}
