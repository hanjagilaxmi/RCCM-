package program;

public class UCLCNOSC {
	public static void main(String[] args) {
		String s="$R1@Tld9";
		String uc="",lc="",no="",sc="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uc=uc+ch;
			}
			else if(Character.isLowerCase(ch))
			{
				lc=lc+ch;
			}
			else if(Character.isDigit(ch))
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
