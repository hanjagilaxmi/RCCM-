package program;

class Instagram_old
{
	void Send()
	{
		System.out.println("upload photo");
	}
}
class Instagram_new extends Instagram_old
{
	void send()
	{
		System.out.println("upload photo, reals,videos");
		super.Send();
	}
}
public class methodoverrid {
	public static void main(String[] args) {
		Instagram_new i=new Instagram_new();
		i.send();
	}

}
