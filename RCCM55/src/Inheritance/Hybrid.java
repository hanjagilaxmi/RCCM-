package Inheritance;

class Sample
{
	int a=26;
}
class Demo extends Sample
{
	void day()
	{
		System.out.println("Welcome to Java");
	}
}
class Test extends Demo
{
	void disp()
	{
		int b=30;
		System.out.println(b);
	}
}
class Cool extends Demo
{
	void mint()
	{
		System.out.println("Start executing programs");
	}
}
public class Hybrid {
	public static void main(String[] args)
	{
		System.out.println("***************Single Level Inheritance****************");
		Demo d=new Demo();
		d.day();
		System.out.println(d.a);
		System.out.println("***************Multi Level Inheritance****************");
		Test t=new Test();
		t.disp();
		t.day();
		System.out.println(t.a);
		System.out.println("***************Hybrid Inheritance****************");
		Cool c=new Cool();
		c.day();
		System.out.println(c.a);
		c.mint();
	}

}
