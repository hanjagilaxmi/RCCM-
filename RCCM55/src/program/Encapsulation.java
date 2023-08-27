package program;

class Instagram
{
	private int pin=2345;
	public  int getpin()
	{
		return pin;
	}
	public void setpin(int pin)
	{
		this.pin=pin;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Instagram i=new Instagram();
		System.out.println(i.getpin());
		i.setpin(14576);
		System.out.println(i.getpin());
	}
}
