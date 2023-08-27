package Methodoverriding;

class Irctc_old
{
	void ticket()
	{
		System.out.println("can book train ticket");
	}
}
class Irctc_new extends Irctc_old
{
	void ticket()
	{
		System.out.println("can book train ticket,flight ticket,bus ticket");
		super.ticket();
	}
}
public class Main {
	public static void main(String[] args)
	{
		Irctc_new i=new Irctc_new();
		i.ticket();
	}

}
