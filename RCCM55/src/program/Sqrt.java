package program;

public class Sqrt {
	public static void main(String[] args) {
		int no=4;
		int sqrt=(int)Math.sqrt(no);
		if(sqrt*sqrt==no)
		{
			System.out.println("Perfect Sqrt");
		}
		else
		{
			System.out.println("not Perfect Sqrt");
		}
	}

}
