package Sample;

 class Tuesday {
	static double day()
	{
		int a=10;
		int b=20;
		final double pi=3.142;
		double res=pi*a*b;
		return res;
		//System.out.println(res);
	}
 }
 public class Demo{
	public static void main(String[] args) {
		double d=Tuesday.day();
		System.out.println(d);
		
	}

}
