class main
{
	public static void main(String args[])
	{
		//Left Rotation
		//arr = 10,20,30,40,50,60
		//lr = 20,30,40,50,60,10

		/*int a[] = {10,32,31,29,1,67};
		int temp = a[0];
		
		System.out.print("before rotation:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0; i<a.length-1; i++)
		{
			a[i] = a[i+1];
		}
		
		System.out.println();
		a[a.length-1] = temp;
		System.out.print("after rotation:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}*/
		
		//Rit rotation

		int a[] = {10,32,31,29,1,67};
		int temp = a[a.length-1];
		
		System.out.print("before rotation:");

		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i = a.length-1; i>0; i--)
		{
			a[i] = a[i-1];
		}
 		
		a[0] = temp;
		System.out.println();
		System.out.print("after rotation:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
