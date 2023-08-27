
public class Buublesortdescending {
	public static void main(String[] args)
	{
		int d[]= {5,8,1,9,45};
		for(int i=0;i<d.length-1;i++)
		{
			for(int j=0;j<d.length-1;j++)
			{
				if(d[j]<d[j+1])
				{
					int s=d[j];
					d[j]=d[j+1];
					d[j+1]=s;
				}
			}
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}

}
