
public class sumofprime {
	public static void main(String[] args)
	{
		int psum=0;
		for(int j=1;j<=100;j++)
		{
			int no=j;
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
			psum=psum+no;
		}
		}
		System.out.println(psum);
		
	}
}
