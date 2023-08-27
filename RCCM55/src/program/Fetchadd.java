package program;

public class Fetchadd {
	public static void main(String[] args) {
		String s="ABCD2024RE34";
		String s1=s.substring(4,8);
		String s2=s.substring(10);
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a+b;
		System.out.println(c);
	}

}
