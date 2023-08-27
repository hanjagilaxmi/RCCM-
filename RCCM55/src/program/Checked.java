package program;

public class Checked {
	static void Buy() throws DiscountException
	{
		int price=9000;
		if(price>9000)
		{
			System.out.println("Disc applied");
		}
		else
		{
			throw new DiscountException("no disc");
		}
	}
	public static void main(String[] args) {
		try {
			Buy();
		}
		catch(DiscountException e)
		{
			System.out.println(e.getmessage());
		}
		
	}
}

class DiscountException extends Exception
{
	String msg;
	DiscountException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
