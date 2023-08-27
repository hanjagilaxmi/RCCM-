package program;

public class HBBBH {
	public static void main(String[] args) {
		String s="H...H";
		String s1="";
		
		if(s.length()==5)
		{
			System.out.println("Yes");
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='.')
			{
				s1=s1+'B';
			}
			else
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}

}
