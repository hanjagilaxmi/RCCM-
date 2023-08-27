package programming;

public class Arrayadding {
	public static void main(String[] args) {
		int[] arr={10,20,30};
		int[] acc= {10,20,30,40};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<acc.length;j++)
			{
				if(arr[i]==acc[j])
				{
					 int a=arr[i]+acc[j];
						System.out.println(a);
				}
//				else if(arr.length<acc.length)
//				{
//					System.out.println(arr[i]);
//				}
//				else if(arr.length>acc.length)
//				{
//					System.out.println(acc[j]);
//				}
			}
		}
	
	}
}
