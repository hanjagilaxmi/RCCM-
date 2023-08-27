package program;

interface Grocery
{ 
	void Buy();
}
class Veg implements Grocery
{
	public void Buy()
	{
		System.out.println("Buy veg");
	}
}
class Fru implements Grocery
{
	public void Buy()
	{
		System.out.println("Buy fruits");
	}
}
class Snacks implements Grocery
{
	public void Buy()
	{
		System.out.println("Buy snacks");
	}
}
class Bigbasket
{
	static void Buy_ALL(Grocery g)
	{
		g.Buy();
	}
}
public class Abstraction {
	public static void main(String[] args) {
		Veg v=new Veg();
		Fru f=new Fru();
		Snacks s=new Snacks();
		Bigbasket.Buy_ALL(v);
		Bigbasket.Buy_ALL(f);
		Bigbasket.Buy_ALL(s);
	}

}
