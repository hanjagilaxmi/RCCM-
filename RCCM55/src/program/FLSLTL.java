package program;

public class FLSLTL {
	public static void main(String[] args) {
		int a[]= {23,12,67,34,89};
		int FL=0,SL=0,TL=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>FL)
			{
				TL=SL;
				SL=FL;
				FL=a[i];
			}
			else if(a[i]>SL)
			{
				TL=SL;
				SL=a[i];
			}
			else if(a[i]>TL)
			{
				TL=a[i];
			}
		}
		System.out.println(FL);
		System.out.println(SL);
		System.out.println(TL);
	}

}
