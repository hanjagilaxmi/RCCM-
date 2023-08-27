package program;

public class Fetchlastelement {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,70};
		int[] abb= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<abb.length;j++)
			{
				
				if(arr[i]==abb[j])
				{
					System.out.println(arr[i]+abb[j]);
				}
				
			}
		}
		if(arr.length>abb.length)
		{
			System.out.println(arr[arr.length-1]);
		}
		else 
		{
			System.out.println(abb[abb.length-1]);
		}
	}
}
