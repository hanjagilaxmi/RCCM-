
public class Asciitoseparate {
	public static void main(String[] args)
	{
		String s="L%9s*zD5";
		String uc="";
		String lc="";
		String sc="";
		String no="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int a=(int)ch;
			if(a>=65&&a<=90)
			{
				uc=uc+ch;
			}
			else if(a>=97&&a<=122)
			{
				lc=lc+ch;
			}
			else if(a>=48&&a<=57)
			{
				no=no+ch;
			}
			else
			{
				sc=sc+ch;
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(no);
		System.out.println(sc);
	}
}
