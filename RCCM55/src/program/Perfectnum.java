package program;

public class Perfectnum {
	public static void main(String[] args) {
		int no=28;
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
	}
}
