package Nonstatic;
class Demo {
	double area()
	{
		int a=10;
		int b=5;
		double res=0.5*a*b;
		return res;
	}
}
	public class Sector{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		double c=d.area();
		System.out.println(c);
	}
	

}
