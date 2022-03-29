class Segregatezero
{
	public static void main(String[] args)
	{
		int arr[] = {0,1,0,0,1,1,1,0,0,0};
		int i,count = 0;
		for(i =0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		for(i=0;i<count;i++)
		{
			arr[i] = 0;
		}
		for(i=count;i<arr.length;i++)
		{
			arr[i] = 1;
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + ",");
		}
	}
}