package program;

public class duplicate {
	public static void main(String[] args) {
		String s="karnataka";
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(a[i]==a[j])
				{
					a[j]='l';
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!='l')
			{
				System.out.println(a[i]);
			}
		}
	}

}
