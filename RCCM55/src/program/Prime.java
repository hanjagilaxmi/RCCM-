package program;

public class Prime {
	public static void main(String[] args) {
	int no=6;
	int count=0;
	for(int i=1;i<=no;i++)
	{
		if(no%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(no+"Prime");
	}
	else
	{
		System.out.println(no+"not prime");
	}
	}
	
}
