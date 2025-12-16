//Print the array elements
class main 
{
	public static void main(String args[])
	{	
		//Print the array elements
		/*int a[] = {10,20,30,40,50};
		System.out.println("Elements in the array:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}*/

		//Average of array elemnts
		/*int a[] = {10,20,40,30,50};
		int average =0, temp = 0;
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = temp;
			average = temp/a.length;
		} 
		System.out.println(average);*/

		//Searching the element
		/*int a[] = {10,20,40,30,50};
		int search = 32, count = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == search)
			{
				System.out.println("Element found");
				count++;
				break;
			}
		}
		if(count == 0)
			System.out.println("Element not found");*/


		//copying elements from one array into another array

		/*int a[] = {10,20,30,40,50};
		int b[] = new int[a.length];

		System.out.print("Array elements in array A: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0,j=a.length-1; i<a.length; i++,j--)
		{
			b[j] = a[i];
		}

		System.out.println();
		System.out.print("Array elements in array B: ");
		for(int j=0; j<a.length; j++)
		{
			System.out.print(b[j]+" ");
		}*/
		

		int a[] = {10,20,30,40,50};
		int b[] = {60,70,80,90,100};
		int c[] = new int[a.length+b.length];
		
		System.out.print("Array elements in array A: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.print("Array elements in array B: ");
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j]+" ");
		}
		
		for(int i=0,k=c.length-1; i<c.length; 0; i++,k--)
		{
			c[k] = a[i];
		}
		
		System.out.println();
		System.out.print("Array elements in array c: ");
		for(int k=0; k<c.length; k++)
		{
			System.out.print(c[k]+" ");
		}

		//Print palindromic prime numbers
	
		/*int a[] = {101,304,506,203,404,67};
		int count = 0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a[i]/2; j++)
			{
				if(a[i]%j == 0)
				{
					count++;
					break;
				}
			}
		}
		if(count == 0)
		{
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]+" ");
			}
		}*/
		
		
		

		
		

		

	}
} 
		
		
		