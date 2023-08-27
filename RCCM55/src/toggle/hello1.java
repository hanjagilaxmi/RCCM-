package toggle;

public class hello1 {
	public static void main(String[] args) {
		String s="hello";
		
		String last=s.substring(s.length()-1);
		String lastUpper=last.toUpperCase();
		String other=s.substring(0,s.length()-1);
		String result=other+lastUpper;
		
		System.out.println(result);
	}
}
