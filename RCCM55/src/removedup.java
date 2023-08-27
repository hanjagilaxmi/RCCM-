
public class removedup {
	public static void main(String[] args)
	{
		String s="karnataka";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='L';
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='L')
			{
				System.out.println(ch[i]);
			}
		}
	}

}
