package program;

public class Fetchaddnum {
	public static void main(String[] args) {
		String s="ABCDEFC2022ASD18";
		String s1=s.substring(7,11);
		String s2=s.substring(14);
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a+b;
		System.out.println(c);
		
		
	}

}
