package program;

class Grocery1
{
	void Buy()
	{
		System.out.println("BUY");
	}
}
class Vege extends Grocery1
{
	void Buy()
	{
		System.out.println("Buy VEG");
	}
}
class Frut extends Grocery1
{
	void Buy()
	{
		System.out.println("Buy Fruits");
	}
}
class Snack extends Grocery1
{
	void Buy()
	{
		System.out.println("Buy SNACKS");
	}
}
class Bigbasket1
{
	static void Buy_ALL(Grocery1 g)
	{
		g.Buy();
	}
}
public class Runtime {
	public static void main(String[] args) {
		Vege v=new Vege();
		Frut f=new Frut();
		Snack s=new Snack();
		Bigbasket1.Buy_ALL(s);
		Bigbasket1.Buy_ALL(v);
		Bigbasket1.Buy_ALL(f);
	}

}
