/*class Sample1
{
      public static void main(String args[]) 
      {
	  int a=8;
          int b=7;
          if(a>b)
          {
             System.out.println("Hello");
          }
       }	

}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class Sample1
{
	public static void main(String args[])
	{
            int num = 29;
	    if(num%2 == 0)
	    {
		System.out.println(num+" is even");

	    }
	    else
	    {
		System.out.println(num+" is odd");
	    }
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class Sample1
{
	public static void main(String args[])
	{
            int num = 0;
	    if(num > 0)
	    {
		System.out.println(num+" is positive");

	    }
	    else
	    {
		System.out.println(num+" is negative");
	    }
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class Sample1 
{
	public static void main(String[] args) 
	{
		int num1 = 200, num2 = 30, num3 = 5;
		if(num1<num2)
		{
			if(num2<num3)
			{	
				System.out.println("num3 is max");
			}
			else
			{
				System.out.println("num2 is max");
			}
		}
		else
		{
			System.out.println("num1 is max");
		}
        }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class Sample1 
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("Hello");
		}
		else if(false)
		{
			System.out.println("He");
		}
		else if(false)
		{
			System.out.println("Hell");
		}
		else if(false)
		{
			System.out.println("Hel");
		}
        }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Sample1
{
	public static void main(String[] args) 
	{
		int num = 1000;
		if(num>=0 && num<=9)
		{
			System.out.println("The Number is single digit");
		}
		else if(num>=10 && num<=99)
		{
			System.out.println("The Number is double digits");
		}
		else if(num>=100 && num<=999)
		{
			System.out.println("The Number is triple digits");
		}
		else if(num>=1000 && num<=9999)
		{
			System.out.println("The Number is four digits");
		}
		else if(num>=10000 && num<=99999)
		{
			System.out.println("The Number is five digits");
		}
		else
		{
			System.out.println("The Number is more than five digits");

		}

	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class Sample1
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		if(Character.isUpperCase(ch))
		{
			System.out.println("It is a upper case character");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println("It is a lower case character");

		}
		else if(Character.isWhiteSpace(ch))
		{
			System.out.println("It is a White Space character");

		}
		else
		{
			System.out.println("It is a Symbol");

		}

	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

class Sample1
{
	public static void main(String[] args) 
	{
		String product = "Mobile";
		int code = 808997;
		double  price = 5000.0;
		int quantity  = 2;
		double total = price * quantity;
		
		if(total>=0 && total<=1000) {
			total = price - (price * 0.10);
			System.out.println(total);
		}
		else if(total>=1000 && total<=2000) {
			total = price  -(price * 0.15);	
			System.out.println(total);
		}
		else if(total>=2001 && total<=4000) {
			total = price  -(price * 0.20);	
			System.out.println(total);
		}
		else if(total>=4001 && total<=6000)  {
			total = price  - (price * 0.20);	
			System.out.println(total);
		}
		else if(total>=6001 && total<=8000)  {
			total = price  - (price * 0.20);	
			System.out.println(total);
		}
		else if(total>=8001 && total<=10000)  {
			total = price  - (price * 0.20);	
			System.out.println(total);
		}
		else if(total>=10001 && total<=12000)  {
			total = price  - (price * 0.20);	
			System.out.println(total);
		}

	 }
}



		

































