package program;

public class Remove {
	public static void main(String[] args) {
		String s[]={"ka","Hi","BYE","Hi"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					s[j]="l";
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!="l")
			{
				System.out.println(s[i]);
			}
		}
	}
}
