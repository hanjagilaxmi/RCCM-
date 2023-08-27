
public class Bubblesort {
	public static void main(String[] args)
	{
		int s[]={23,56,87,13};
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=0;j<s.length-1;j++)
			{
				if(s[j]>s[j+1])
				{
					int temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
