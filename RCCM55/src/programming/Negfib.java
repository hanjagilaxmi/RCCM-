package programming;

public class Negfib {
	public static void main(String[] args)
	{
		int fib1=0;
		int fib2=1;
		System.out.println("Pos\t\tFib values");
		System.out.println("0\t\t"+fib1);
		System.out.println("0\t\t"+fib2);
		
		for(int i=1;i<=20;i++)
		{
			int fib3=fib1-fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.println(i+"\t\t"+fib3);
		}
	}

}
