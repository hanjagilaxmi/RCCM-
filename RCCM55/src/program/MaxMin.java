package program;

public class MaxMin {
	public static void main(String[] args) {
		int arr[]= {12,56,34,23,9,8};
		int max1=0,max2=0,max3=0,max4=0,max5=0,max6=0;
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max1)
				{
					max6=max5;
					max5=max4;
					max4=max3;
					max3=max2;
					max2=max1;
					max1=arr[i];
				}
				else if(arr[i]>max2)
				{
					max6=max5;
					max5=max4;
					max4=max3;
					max3=max2;
					max2=arr[i];
				}
				else if(arr[i]>max3)
				{
					max6=max5;
					max5=max4;
					max4=max3;
					max3=arr[i];
				}
				else if(arr[i]>max4)
				{
					max6=max5;
					max5=max4;
					max4=arr[i];
				}
				else if(arr[i]>max5)
				{
					max6=max5;
					max5=arr[i];
				}
				else if(arr[i]>max6)
				{
					max6=arr[i];
				}
			}
			System.out.println(max5);
			System.out.println(max2);
		}
	}

}
