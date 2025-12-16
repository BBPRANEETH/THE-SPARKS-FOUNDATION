class main
{
	public static void main(String args[])
	{
		int a[] = {10,30,4,56,8,99};
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax = max;
				max = a[i];
			}
			
			if(a[i]>smax && a[i]<max)
			{
				smax = a[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);
	}
}