package program;

public class Rotating1 {
	public static void main(String[] args) {
		int no=123654;
		String s=String.valueOf(no);
		char [] ch=s.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]==1||ch[i]==4)
//			{
				char temp=ch[1];
				ch[1]=ch[5];
				ch[5]=temp;
			//}
		//}
		for(int i=0;i<1;i++)
		{
		System.out.println(ch);
		}
	}
}
