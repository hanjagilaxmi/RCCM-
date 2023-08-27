package programming;

public class Sort {
	public static void main(String[] args)
	{
		int xyz[]= {34,98,13,5,67};
		for(int i=0;i<xyz.length-1;i++)
		{
			for(int j=0;j<xyz.length-1;j++)
			{
				if(xyz[j]<xyz[j+1])
				{
					int temp=xyz[j];
					xyz[j]=xyz[j+1];
					xyz[j+1]=temp;
				}
			}
		}
		for(int i=0;i<xyz.length;i++)
		{
			System.out.print(xyz[i]+ " ");
		}
	}
}
