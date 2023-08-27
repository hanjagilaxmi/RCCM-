package program;

public class Rotating {
	public static void main(String[] args) {
		int no=1289745;
		String s=String.valueOf(no);
		char ch[]=s.toCharArray();
		
	
		//for(int i=0;i<ch.length;i++)
		//{
//			 int i=0;
//			 if(ch[i]==1||ch[i]==5)
//			 {
				 char temp=ch[1];
				 ch[1]=ch[5];
				 ch[5]=temp;
				 
			 //}
			
		//}
			 for(int j=0;j<1;j++)
			 {
				 System.out.println(ch);
			 }
	}
}
