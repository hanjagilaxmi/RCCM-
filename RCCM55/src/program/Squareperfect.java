package program;

public class Squareperfect {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int no=i;
			int sqrt=(int)Math.sqrt(no);
			if(sqrt*sqrt==no)
			{
				System.out.println(no+ " num is perfect");
			}
			else
			{
				System.out.println(no+" num is not perfect");
			}
		}
	}

}
