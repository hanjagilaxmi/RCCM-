package scanner1;

import java.util.Scanner;

public class scan1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=sc.nextInt();
		for(int i=1;i<=100;i++)
		{
			int no1=i;
			int count=0;
			for(int j=1;j<=no1;j++)
			{
				if(no1%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(no1+" is a Prime ");
			}
			else
			{
				System.out.println(no1+" is not a Prime ");
			}
		}
	}

}
