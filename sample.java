/*class sample
{
    public static void main(String args[])
    {
	String name = "Praneeth";
        int roll = 3315;
        int fee = 20000;
        int donation = 0;
        int scholorship = 0;
        char section = 'B';
        int m1=18,m2=5,m3=20;
        double total = m1+m2+m3;
        double max = 60.0;
        double percentage = total/max*100;
        System.out.println(percentage);
        if(percentage > 80)
	{
	   scholorship = 10000;
           donation = 0;
           section = 'a';
   	   int total_fee = fee + donation - scholorship;
           System.out.println(total_fee);
	}
        else
	{
	  scholorship = 0;
	  donation = 15000;
          section  = 'c';
	  int total_fee = fee + donation + scholorship;
	  System.out.println(total_fee);
	}
 	
     }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class If
{
   public static void main (String args[])
   {
	int num = 25;
        if(num == 25)
	{
	  System.out.println(num);
	}
	System.out.println("Program Completed");
    }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class If 
{
   public static void main (String args[])
   {
	int a = 70,b = 50;
        if(a != b)
        { 
	  a = a+b;
   	  b = a-b;
  	  a = a-b;
        } 
        System.out.println(a+" "+b);
   }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class If
{
   public static void main(String args[])
   {
	int age = 16;
        if(age >= 18)
        {
  	   System.out.println("Eligible to vote");
        }
        else
        {
           System.out.println("Not eligible to vote");
        }
    }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
   public static void main (String args[])
   {
	int m1=178, m2=188, m3=199;
        int max_marks = 600;
        int total = m1+m2+m3;
        double percentage = total/600.0*100;
        System.out.println(percentage);

        if(percentage > 35)
	{
	   System.out.println("Pass");
	}
        if(percentage < 35)
 	{
	   System.out.println("Fail");
	}
   }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
    public static void main (String args[])
    {
        int p_id = 2, quantity = 5;
        String p_name = "Mouse";
        double p_price = 1500;
        String payment = "cash";

        if (payment == "upi")
        {
            p_price = 85.0 / 100 * p_price * quantity; 
            System.out.println(p_price);
        }

        if (payment == "cash")
        {
            p_price = 90.0 / 100 * p_price * quantity; 
            System.out.println(p_price);
        }


        if (payment == "card")
        {
            p_price = 95.0 / 100 * p_price * quantity; 
            System.out.println(p_price);
        }
    }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
  	public static void main (String args[])
	{
            int num = 16;
	    if(num%4 == 0)
            {
 		if(num%3 == 0)
		{
		   System.out.println("The number is divisible by 3");
		}
		System.out.println("The number is divisible by 4");
            }
	}
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{ 
   	public static void main (String args[])
	{
            String student = "Btech";
	    if(student == "Btech")
            {
 		if(student == "MCA")
		{
		   System.out.println("Not eligible");
		}
		System.out.println("Eligible");
  	    }
        }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample {
    public static void main(String args[]) {
        char ch = 'A';

        if (Character.isUpperCase(ch)) {
            System.out.println("Capital");
        } else {
            System.out.println("Not Capital");
        }
    }
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
        public static void main (String args[])
	{
	    int num = 14;
            if(num%2 == 0 && num%4 == 0)
	    {
		System.out.println("The given number is divisible by 2 & 4");
	    }
	    else
	    {
		System.out.println("The given number is not divisible by 2 & 4");
 	    }
 	}  
 }*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
        public static void main (String args[])
	{
	    int total_price = 12000;
	    String p_type = "offline";
	    double total_bill = 0.0;
	    String p_mode = "cash";
	    if(p_type == "online")
	    {
		if(p_mode == "upi")
		{
			total_bill = total_price - (total_price * 0.20);
		        System.out.println(total_bill);
		}
		else
       		{
			total_bill = total_price - (total_price * 0.15);
			System.out.println(total_bill);
		}
	    }
	    else
            {
		total_bill = total_price - (total_price * 0.05);
		
	    }
	}
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main (String args[])
	{
		int age = 12;
		if(age < 60)
		{
			if(age >= 18)
			{
				System.out.println("He is a major");	 
			}
			else
			{
				System.out.println("He is a minor");
			}
		}
		else
		{
			System.out.println("He is a senior citizen");

		}		
	}
}/*

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main (String args[])
	{
		double number = 4.15;
		double last_digit = number%2;	
		System.out.println(last_digit);
	}
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample 
{
  	public static void main (String args[])
	{
		double num = 3.090;
		if(num%2 == 0 || num%2 == 1)
		{
			System.out.println("The given number is integer");
		}
		else
		{
			System.out.println("The given number is double");
		}
         }
}*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample 
{
	public static void main(String[] args) 
	{
        	double d = 4.15;
		int i = (int) d; 
		System.out.println(d);
		System.out.println(i);

    }
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*class sample 
{
	public static void main(String args[])
	{
		int month = 16;
		int week = 1;
		if (month == 1)
			System.out.println("Jan");
		else if (month == 2)
			System.out.println("Feb");
		else if (month == 3)
			System.out.println("Mar");
		else if (month == 4)
			System.out.println("Apr");
		else if (month == 5)
			System.out.println("May");
		else if (month == 6)
			System.out.println("Jun");
		else if (month == 7)
			System.out.println("Jul");
		else if (month == 8)
			System.out.println("Aug");
		else if (month == 9)
			System.out.println("Sept");
		else if (month == 10)
			System.out.println("Oct");
		else if (month == 11)
			System.out.println("Nov");
		else if (month == 12)
			System.out.println("Dec");
		else
			System.out.println("Invalid");
	
		if (week == 1)
			System.out.println("Monday");
		else if (week == 2)
			System.out.println("Tuesday");
		else if (week == 3)
			System.out.println("Wednesday");
		else if (week == 4)
			System.out.println("Thursday");
		else if (week == 5)
			System.out.println("Thursday");
		else if (week == 6)
			System.out.println("Friday");
		else if 


		
		
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int a = 13, b;
		b = a++;
		System.out.println(a);
		System.out.println(b);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*class sample 
{
	public static void main(String args[])
	{
		int a = 13, b;
		b = a--;
		System.out.println(a);
		System.out.println(b);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
		
/*class sample 
{
	public static void main(String args[])
	{
		int a = 34, b;
		b = a++ + ++a - --a + ++a + --a -a + a++;
		System.out.println(b);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int a = 12, b = 44, c;
		c = a++ + b++ - a-- + b++ + b++ + b + a-- + a++ +a;
		System.out.println(c);
	}
}*

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*class sample 
{
	public static void main(String args[])
	{
		int b = 1;
		System.out.println("Inside the loop");
		while(b <  3)
		{
			System.out.println("Loop");
			break;
		}
		System.out.println("Outside the loop");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int a = 10, b = 20;
		int c = ++a + a++ + --b + ++b + a--;//11+11+19+20+12
		int d = a++ + c++ + --c + ++b + b--;//11+73+73+21+20
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int num1 = 5;
		String result = (num1%5==0 )? ((num1%3==0)? ("divisible by 5 & 3") : ("divisble by 5")) : ((num1%2==0)? ("Even"):("Odd"));
		System.out.println(result);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int num = 19989;
		while(num != 0)
		{
			System.out.println(num%10);
			num/=10;
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*class sample 
{
	public static void main(String args[])
	{
		int num1 = 5, num2 = 7, num3 = 8;
		String result = (num1>num2 && num1>num3)? ("Num1 is Greater") : (num2>num3)?  ("Num2 is Greater") : ("Even"):("Odd"));
		System.out.println(result);
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int num = 9989, rem = 0, rev = 0, a = num;
		while(num != 0)//998!=0
		{
			rem = num%10;//9//998%10=8
			rev = rev*10+rem;/0*10+9=9//9*10+8
			num /= 10;//998			
		}
		System.out.println((rev==a)? ("Palindrome"):("Not a palindrome"));
		
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample 
{
	public static void main(String args[])
	{
		int num = 123, rem = 0, rev = 0,  cube=0;
		while(num != 0)
		{
			rem = num%10;
			cube = rem*rem*rem;
			num /= 10;			
		}
		System.out.println(cube);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int i = 1;
		while(i<20)
		{
			while(i%2==0)
			{
			System.out.println(i);
			i++;
			}
		i++;
		}
		
	}

}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 

/*class sample 
{
	public static void main(String args[])
	{
		int i = 1, count = 1;
		while(i<20)
		{
			while(i%2!=0)
			{
				System.out.println(i);
				i++;
			}
		i++;
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int num = 3124, rev = 0, rem =0;
		while(num != 0)
		{
			rem = num%10; //9//8//9//1
			rev = rev*10+rem;//1//9//8//9
			num/=10;
		}
		while(rev  != 0)
		{
			System.out.println(rev%10);
		        rev/=10;
		}
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//printing sum and product of digits of a number

/*class sample 
{
	public static void main(String args[])
	{
		int num = 329, rem = 0, mul = 1, sum = 0;
		while(num != 0)
		{
			rem = num%10; //9//2//3
			mul = mul*rem;
		        sum = sum+rem;
			num/=10;
		}
		System.out.println((sum == mul)? ("Special Numbers"):("Not a Special Number"));
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int num = 3290	, count = 0;
		while(num != 0)
		{
			count++;
			num/=10;
		}
		System.out.println(count%2 ? "Even number of digits" : "Odd number of digits");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
/*class sample 
{
	public static void main(String args[])
	{
		int num = 3092, rem = 0, product = 1;
		while(num%10 != 0)
		{
			rem = num%10;
			num /=10; 
			if(rem != 0)
			{
				product *= rem;
			}
		} 
		System.out.println(product);	
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int num = 3092, rem = 0, rev = 0;
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num /=10;
		}
		while(rev!=0)
		{
			rem = rev%10;
			num /= 10;
			switch(rem)
			{
				case 1 :System.out.println("One");
					break;
				case 1 :System.out.println("One");
					break;
				case 1 :System.out.println("One");
					break;
		}
		
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Armstrong or not a armstrong

/*class sample 
{
	public static void main(String args[])
	{
		int num=371, count=0, rev=0, rem=0, copy=num, sum=0, temp=num;
		while(num != 0)
		{
			count++;
			num /=10;
		}
		while(copy != 0)
		{
			rem = copy%10;
			sum = sum + (int)Math.pow(rem, count);
			copy/=10;
		}
		System.out.println(temp == sum? "It is a armstrong" : "It is not a armstrong");
		
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample 
{
	public static void main(String args[])
	{
		int num=371, rem=0, count1=0, sum = 0;
		while(num != 0)
		{
			count1++;
			num/=10;	
			if(count1 == 1 || count1 == 3)
			{
				sum = count1+sum;
				System.out.println(sum);
			}	
			
		}
		
		
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
	public static void main(String args[])
	{
		int num = 407, count=0, copy = num, rem = 0, sum = 0, temp = num;
		while(num != 0)
		{
			count++;
			num /=10;
		}  		
		while(copy != 0)
		{
			rem = copy%10;
			sum = sum+(int)Math.pow(rem,count);
			copy /= 10;
		}
		System.out.println(sum == temp? "It is a armstrong number" : "It is not a armstrong number");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
	public static void main(String args[])
	{
		int num = 497, rem=0, rev=0 rem2=0;
		while(num != 0)
		{
			rem = num%10;
			num/=10;
			rev = rev*10+rem;
		}
		while(rev != 0)
		{
			rem2 = rev%10;
			num/=10;
		}
		System.out.println(rem2);
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num = 953678, n1=0, n2=0, sum=0, rem=0, product=1;
		n1 = num/1000;
		n2 = num%1000;
		sum = n1+n2;
		while(sum != 0)
		{ 
			rem = sum%10;
			product = product * rem;
			sum/=10;
		}
		System.out.println(product);
		if(product%5==0)
			System.out.println("Divisible by 5");
		else
			System.out.println("Not divisible by 5");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		

/*class sample
{
	public static void main(String args[])
	{
		int num = 7894,n1,n2,rem;
	 f	n1 = num/100;
		n2 = num% 100;
		while(num != 0)
		{
			rem = num%10;
			
		} 

	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num = 975124, copy = num, count = 1; 
		while(num != 0)
		{
			count++;
			num /= 1000;
		}
		int half = count/2;
		int n1 = copy/(int)Math.pow(1000, half);
		int n2 = copy%(int)Math.pow(1000, half);
		System.out.println(n1);
		System.out.println(n2);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
	 	int num = 3467, rem=0;
		while(num != 0)
		{
			rem = num%10;
			if(rem%2==0)
				System.out.println(rem +" Even Number");
			else
				System.out.println(rem +" Odd Number");
			num/=10;
		}
	}
}*/
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num = 98712,rem = 0;
		while(num != 0)
		{
			rem = num%10;
			double root = Math.sqrt(rem);
			if(root == (int)root)
				System.out.println(rem +" Perfect Square number");
			else
				System.out.println(rem +" Not a Perfect Square number");

			num/=10;
		} 
		
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num = 98712,rem = 0,count=0;
		while(num != 0)
		{
			rem = num%10;
			count++;
			System.out.println(rem+ " --> " +count);
			num/=10;	
		}
	}	
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//sum of odd digits in number

/*class sample
{
	public static void main(String args[])
	{
		int num = 5423,rem = 0, sum = 0;
		while(num != 0)
		{
			rem = num%10;
			if(rem%2!=0)
				sum = sum+rem;
				num/=10;
		}
		System.out.println(sum);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
//sum of even digits

/*class sample
{
	public static void main(String args[])
	{
		int num = 5423, rem=0, sum=0;
		while(num != 0) //54129!=0 
		{
			rem = num%10; //54129%10
			if(rem%2 == 0)
				sum = sum+rem;
				num/=10;
		}
		System.out.println(sum);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//product of even digits

/*class sample
{
	public static void main(String args[])
	{
		int num = 5423, rem=0, product=1;
		while(num != 0) 
		{
			rem = num%10;
			if(rem%2==0)
				product *= rem;
				num/=10;
		}
		System.out.println(product);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//product of odd digits

/*class sample
{
	public static void main(String args[])
	{
		int num = 5423, rem=0, product=1;
		while(num != 0) 
		{
			rem = num%10;
			if(rem%2!=0)
				product *= rem;
				num/=10;
		}
		System.out.println(product);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//no of even & odd digits

/*class sample
{
	public static void main(String args[])
	{
		int num = 5423, rem=0, product=1, count1=0, count2=0;
		while(num != 0)
		{
			rem = num%10;
			if(rem%2==0)
				count1++;
			else
				count2++;
			num/=10;
		}
		System.out.println("The even digits are:"+count1);
		System.out.println("The odd digits are:"+count2);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//palindrome or not

/*class sample
{
	public static void main(String args[])
	{
		int num = 11014, rem=0, rev=0, copy = num;
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		System.out.println(copy == rev ? "It is a palindrome" : "It is not a palindrome");
	}
}*/
			
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//armstrong or not

/*class sample
{
	public static void main(String args[])
	{
		int num = 153, rem=1,  copy=num, temp=num, count = 0;
		double result = 0;
		while(num != 0) //371!=0
		{
			count++;
			num/=10;
		}
		while(copy != 0)
		{
			rem = copy%10;
			result = result+Math.pow(rem,count);
			copy/=10;	
		}
		
		System.out.println(result==temp ? "It is a armstrong number":"It is not a armstrong");
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num = 32496, rem=0;
		while(num != 0)
		{
			rem = num%10;
			switch(rem)
			{
				case 6:System.out.println("Six");
					break;
				case 9:System.out.println("Nine");
					break;
				case 4:System.out.println("Four");
					break;
				case 2:System.out.println("Two");
					break;
				case 3:System.out.println("Three");
					break;
				default: System.out.println("Zero");
					break;
			}
			num/=10;
			
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num = 32496, rem=0, rev=0, rem2=0;
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
			while(rev != 0)
			{
				rem2 = rev%10;
				switch(rem2)
				{
					case 6:System.out.println("Six");
						break;
					case 9:System.out.println("Nine");
						break;
					case 4:System.out.println("Four");
						break;
					case 2:System.out.println("Two");
						break;
					case 3:System.out.println("Three");
						break;
					default: System.out.println("Zero");
						break;
				}
		        	rev/=10;
			}
		
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 

/*class sample
{
	public static void main(String args[])
	{
		int num = 32400, rem=0, rev=0, rev1=0, rem1=0, count1 = 0, count2 = 0, copy1 = 0, copy2 = 0;
		while(num != 0)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		
			while(rev != 0)
			{
				count1++;
				rem1 = rev%10;
				rev1 = rev1*10+rem1;
				copy1 = count1;
			
				while(rev1!=0)
				{
					count2++;
					copy2 = count2;
					rev1/=10;
				}
				rev/=10;
			}

					
				num/=10;
		}
				System.out.println(count1);
				System.out.println(count2);

	
	}

}*/
		
			
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num = 567, rem=0;
		do
		{
			
			System.out.println(rem);
			rem = num%10;
			num/=10;
		}
		while(num != 0);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int end = 10; 
		for(int start=-45; start<=end; start++)
		{
			System.out.println(start);
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int end = 10, count=0; 
		for(int start=-45; start<=end; start++)
		{
			count++;
			System.out.println(start);
		}
		System.out.println("Count:"+count);

	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int end = 10, sum = 0;
		for(int start = 1; start<=end; start++)
		{
			sum = sum+start;
		}
		System.out.println(sum);
		
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int end=1, product=1;                                                       
		for(int start = 10; start>=end; start--)
		{
			System.out.println(start);
		
		}
		
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
	public static void main(String args[])
	{
		int num = 3240, rem=0, rev=0, rev1=0, rem1=0, count1 = 0, count2 = 0, diff = 0, sqrt = 0;
		while(num != 0)
		{
			count1++;
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		while(rev != 0)
		{
			count2++;
			rem1 = rev%10;
			rev1 = rev1*10+rem1;
			rev/=10;
		}
		diff = count1 - count2;
		sqrt=(int)Math.pow(10,diff);
		System.out.println(rev1*sqrt);	
		
	}

}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//printing 1 to 20 digits

/*class sample
{
	public static void main(String args[])
	{
		int num = 1;
		while(num <= 20)
		{
			System.out.println(num);
			num++;
		}
	}

}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//printing even numbers in between 1 to 5

/*class sample
{
	public static void main(String args[])
	{
		int num = 1;
		while(num <= 50)
		{
			if(num%2==0)
			{
				System.out.println(num);
			} 
			num++;
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Print the multiplication table of a number using a while loop

/*class sample

{
	public static void main(String args[])
	{
		int num = 86755, count=0, rem=0, rev=0, copy=num, end=count/2, n1=0, n2=0, copy=num;
		while(num != 0) {
			count++;
			rem = num%10;
			rev = rev*10+rem; 
			num/=10;,
		}
		for(int start = 1; start<=end; start++)		
		{
			n1 = copy%10;
			n2 = rev%10;
		}
			
	}		
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//prime number or not		

/*class sample
{
	public static void main(String args[])
	{
		int num=19, count=0;
		for(int start = 2; start<=num/2; start++)
		{
			if(num%start==0)
				count++;
				break;
		}
				if(count==0)
					System.out.println(num+" is a Prime");
				else
			 		System.out.println(num+" is Not a Prime");
	}
}*/
		

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
	public static void main(String args[])
	{
		int num=69, count=0;
		for(int start=1; start<=num; start++)
		{
			if(num%start==0)
				count++;
		}
				if(count==2)
					System.out.println(num+" is a Prime");
				else
			 		System.out.println(num+" is Not a Prime");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num=69, count=0;
		for(int start=1; start<=num/2; start++)
		{
			if(num%start==0)
				count++;
		}
				if(count==1)
					System.out.println(num+" is a Prime");
				else
			 		System.out.println(num+" is Not a Prime");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num=69, count=0;
		for(int start=1; start<=num/2; start++)
		{
			if(num%start==0)
				count++;
		}
				if(count==1)
					System.out.println(num+" is a Prime");
				else
			 		System.out.println(num+" is Not a Prime");                                                                                                           
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num=7, end=1, fact=1;
		for(int start=num; start>=end; start--)
		{
			fact *= start;
		}
		System.out.println(fact);
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{
	public static void main(String args[])
	{
		int num=18, count=0, sqrt=0;
		for(int i=1; i<=num; i++)
		{
			sqrt = (int)Math.sqrt(i);
			if(sqrt*sqrt == i)
				System.out.println( "The Number "+i+" Perfect Square Number");
			else
				System.out.println("The Number "+i+"  Not a Perfect Square Number"); 
		}                                                                                                   
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int num=7, end=10, start, mul=0, sum=0;
		for(start=1; start<=end; start++)//1<=10t//2<=10t//3<=10t//4<=10t//5<=t//6<=10t//7<=10t....//10<=10t
		{
			mul = num*start;//7*1//
			if(mul%2 != 0)
				sum = sum+mul;
		}	
		System.out.println(sum);
		                                                                                                 
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//common factors in two numbers

/*class sample
{
	public static void main(String args[])
	{
		int n1=24, n2=32, max=0;
		for(int i=1; i<=n1 && i<=n2; i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.println(i);
			}
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//fibnacci series

/*class sample
{
	public static void main(String args[])
	{
		long f=0, s=1, t=0;
		for(int i=1; i<=100; i++)
		{
			System.out.println(f);
			t = f+s;	
		 	f=s;
			s=t;
		}	
	}
}*/
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

/*class sample
{
	public static void main(String args[])
	{
		int f=0, s=1, t=0, i=0;
		for(; f<=650;)
		{
			t = f+s;
			System.out.println(f);	
		 	f=s;
			s=t;
		}	
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	public static void main(String args[])
	{
		int f=0, s=1, t=0;
		for(; f<=2;)
		{
			t = f+s;	
		 	f=s;
			s=t;	
		}
		System.out.println(f);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{  
	public static void main(String args[])
	{
		int f=0, s=1, t=1;
		for(; f<=2; )
		{
			t=f+s;
		 	f=s;
			s=t;	
		}
		System.out.println(f);	
	}
}*/



//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{  
	public static void main(String args[])
	{
		int num=675523, rem=0, search=5;
		while(num != 0)
		{
			rem=num%10;
			if(rem==search) 
				System.out.println("Element Found");
			else
				System.out.println("Element Not Found");

			num/=10;
		}
	}
}*/
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	

/*class sample
{  
	public static void main(String args[])
	{
		int num=675523, rem=0, search=6, count=0;
		while(num != 0)
		{
			rem=num%10; 
				if(search==rem)	{
					count++;
					break;
				}
			num/=10;
		}
		System.out.println(count);
		if(count != 0)
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{  
	public static void main(String args[])
	{
		int f=0, s=1, t=1;
		for(; f<=2; )
		{
			t=f+s;
		 	f=s;
			s=t;	
		}
		
			
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{  
	public static void main(String args[])
	{
		int x,y;
		for(x=1; x<=5; x++)
		{
			for(y=1; y<=5; y++)
			{
				for(int z=1; z<=5; z++)
				{
				System.out.println(x+" "+y+" "+z);
				}			
			}
			
		}
		
	}
}*/
				
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1 to 100 palindrome numbers
/*class sample
{  
	public static void main(String args[])
	{
		void	
			for(int i=1; i<=100; i++)
			{
				int f=0,s=1,t=0;
				System.out.println(first);
				first = second;
				second = third;			
			}
		
		}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{  
	public static void main(String args[])
	{
		for(int i=1; i<=100; i++)
		{
			int num=i,start=0,count=0;
			for(start=1; start<=num; start++)
			{
				if(num%start==0)
				{
					count++;
				}
			}
			 	if(count==2)
					System.out.println(num+" It is a prime");
		}
	}
}*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{  
	public static void main(String args[])
	{
		int rows = 5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)//1//2
			{
				System.out.print(" *");//*
			}
			System.out.println();
		}
	}
}*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class sample
{  
	public static void main(String args[])
	{
		int rows = 5;
		for(int i=1; i<=rows; i++)//
		{
			for(int j=1; j<=i; j++)//1//2
			{
				System.out.print(i+" "+j);//*
			}
			System.out.println();
		}
	}
}*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{  
	public static void main(String args[])
	{
		int x,y;
		for(x=1; x<=5; x++)
		{
			for(y=1; y<=5; y++)
			{
				if(x>=y)
					System.out.println(x+" "+y);			
			}
			
		}
		
	}
}*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1 to 10 prime or not using for loop

/*class sample
{  
	public static void main(String args[])
	{
		for(int x=1; x<=100; x++)
		{
			int num=x, count=0;
			for(int start=2; start<=num; start++)
			{
				if(num%start==0)
	  ......			{
					count++;
				}
			}
			if(count==1)
				System.out.println(num+" It is a prime");
		}
	}
}*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1 to  100 palindrome or not

/*class sample
{  
	public static void main(String args[])
	{
		for(int i=1; i<=100; i++)
		{
			int num=i,rem=0,rev=0,copy=num;
			while(num != 0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			if(copy==rev)
				System.out.println(copy+" It is a palindrome");
			else
				System.out.println(copy+" It is not a palindrome");
		}
		
	}

}*/   


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{  
	public static void main(String args[])
	{
		sample s = new sample();
		s.addNum();
	}
}*/ 

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class sample
{
	void addNum()
	{
		int n1=3,n2=45,sum=0;
		sum = n1+n2;
 		System.out.println(sum);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*interface A
{
	public void m1();
	public void m2();
}

class Aimp implements A
{
	public void m1()
	{
		System.out.println("M1");
	}
	
	public void m2()
	{
		System.out.println("M2");
	}
}

class sample
{
 	public static void main(String args[])
	{
		Aimp b = new Aimp();
		A a = new Aimp();
		b.m1();
		b.m2();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
/*interface A
{
	public void m1();
}

interface B 
{
 	public void m2();
}

class C implements A, B
{
	public void m1()
	{
		System.out.println("M1");
	}

	public void m2()
	{
		System.out.println("M2");
	}
}

class sample
{ 
	public static void main(String args[])
	{
		C C = new C();
		C.m1();
		C.m2();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*interface Bank
{
	 public void withdrawl();
	 public void maxTransaction();
	 public void changePin();
}

class Bank1 implements Bank
{
	public void withdrawl()
	{
		System.out.println("Withdrawl :" +20000);
	}
	
	public void maxTransaction()
	{
		System.out.println("Max Transaction :" +2);
	}

	public void changePin()
	{
		System.out.println("Change Pin :" +3);
	}
}


class Bank2 implements Bank
{
	public void withdrawl()
	{
		System.out.println("Withdrawl :" +20000);
	}
	
	public void maxTransaction()
	{
		System.out.println("Max Transaction :" +2);
	}

	public void changePin()
	{
		System.out.println("Change Pin :" +3);
	}
}

class Bank3 implements Bank
{
	public void withdrawl()
	{
		System.out.println("Withdrawl :" +20000);
	}
	
	public void maxTransaction()
	{
		System.out.println("Max Transaction :" +2);
	}

	public void changePin()
	{
		System.out.println("Change Pin :" +3);
	}
}



class sample
{
 	public static void main(String args[])
	{
		Bank1 b = new Bank1();
		b.withdrawl();
		b.maxTransaction();
		b.changePin();

		Bank2 C = new Bank2();
		C.withdrawl();
		C.maxTransaction();
		C.changePin();

		Bank3 D = new Bank3();
		D.withdrawl();
		D.maxTransaction();
		D.changePin();

	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Student
{
	private String password;
	public void setPassword(String Password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return password;
	}
}

class sample
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setPassword("H1!W#E$466");
		System.out.println(s.getPassword());
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*public class forloop {

	public static void main(String[] args) 
	{	
		student s = new student();
		s.setName("Nimiya");
		s.setEmail("nimiawwe@gmail.com");
		s.setPassword("123678000");
		System.out.println("Name : "+s.getName());
		System.out.println("Email : "+s.getEmail());
		System.out.println("Password : "+s.getPassword());
		
	}

}

class student 
{
	private String name;
	private String email;
	private String password;
	
	public void setName(String name)
	{
		this.name = name; 
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setPassword(String password)
	{
		this.password = password; 
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getPassword() 
	{
		return password;
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
