
public class Removeduplicate {
	public static void main(String[] args)
	{
		String s[]= {"Lax","Hi","Bye","Lax","Bye"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					s[j]="Deep";
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!="Deep")
			System.out.println(s[i]);
		}
			
	}

}
