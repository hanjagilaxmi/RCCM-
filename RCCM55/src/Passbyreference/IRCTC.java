package Passbyreference;

class Train
{
	void ticket()
	{
		System.out.println("Train ticket booked Successfully");
	}
}
public class IRCTC {
	public static void main(String[]args) {
	Train t=new Train();
	Passenger1.buy(t);
	Passenger2.buy(t);
	}
}
class Passenger1
{
	static void buy(Train a)
	{
		a.ticket();
	}
}
class Passenger2
{
	static void buy(Train b)
	{
		b.ticket();
	}
}
