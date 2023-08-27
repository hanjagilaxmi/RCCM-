package program;

public class Missing {
 public static void main(String[] args) {
	int arr[]= {1,2,3,5,6,7};
	int abb[]= {1,2,3,4,5,6,7};
	int sum=0;
	int sum1=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
	}
		for(int j=0;j<abb.length;j++)
		{
			sum1=sum1+abb[j];
		}
			int miss=sum1-sum;
			System.out.println(miss);
	
}
}
