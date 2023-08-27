package program;

public class collids {
	public static void main(String[] args) {
		int no=5;
		System.out.println(no);
		while(no!=1)
		{
		if(no%2==0)
		{
			no=no/2;
		}
		else
		{
			no=3*no+1;
		}
		System.out.println(no);
		}
	}

}
