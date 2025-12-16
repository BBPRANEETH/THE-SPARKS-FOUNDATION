/*class main
{  
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.addNum();
		s.subNum();
	}
}

class Sample
{
	void addNum()
	{
		int n1=9, n2=6, sum=0;
		sum=n1+n2;
		System.out.println(sum);
	}
	void subNum()
	{
		int n1=12, n2=4, sub;
		sub=n1-n2;
		System.out.println("Sub="+sub);
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Sample
{
	String check()
	{
		int num=12;
		if(num%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
}

class main
{  
	public static void main(String args[])
	{
		Sample s = new Sample();
		System.out.println(s.check());
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Sample
{
	void check()
	{
		int num=1872,rem=0,rem1=0,rev=0, count=0;
		while(num != 0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		while(rev != 0)
		{
			count++;
			rem1 = num%10;
			rev/=10;
		}
		System.out.println(count);
	}
}

class main
{  
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.check();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Sample 
{
	void fact()
	{
		int num = 4, fact=1;
		for(int i=1; i<=num; i++)
		{
			fact *= i;
		}
		System.out.println(fact);
	}
}
class main
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.fact();
	}
}*/
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
/*class Sample 
{
	void fact()
	{
		int num = 5	, fact=1, count=0;
		for(int i=1; i<=num; i++)
		{
			fact *= i;
		}
		while(fact !=0)
		{
			count++;
			fact/=10;
		}
		System.out.println(count);
	}
}
class main
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.fact();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Sample 
{
	void fact()
	{
		for(int x=1; x<=100; x++)
		{
			int num=x, count=0;
			for(int start=2; start<=num; start++)
			{
				if(num%start==0)
				{
					count++;
				}
			}
			if(count==1)
				System.out.println(num+" It is a prime");
		}

	}
}

class main
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.fact();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Sample 
{
	void onPalindrome()
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
}
class main
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.onPalindrome();
	}
}*/
		

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class Sample 
{
	void onPalindrome()
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
}
class main
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.onPalindrome();
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{
		Student s = new Student();
		int sm = s.totalMarks(89,87,45,90,98,67);
		System.out.println("Total marks:" +sm);
		System.out.println("Average Marks:" +s.avgCal());
	}
}
class Student 
{
	int totalMarks(int m1,int m2,int m3,int m4,int m5,int m6)
	{	
		return m1+m2+m3+m4+m5+m6;
	}
	double avgCal()
	{
		int sum = totalMarks(89,87,45,65,80,100);
		return sum/6.0;
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{
		Student s = new Student();
		System.out.println("Prime or not:"+s.primeorNot());
		System.out.println("Fibnacci series:");
		s.fibNacci();
		double mul = s.multiplication(3,3);
		System.out.println("Multiplication:"+mul);
	}
}

class Student 
{
	int num=443;
	String primeorNot() 
	{
		int count=0;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
				count++;
		} 
		if(count==0)
			return "Prime";
		else
			return "Not a prime";
	}
	
	void fibNacci()
	{
		int a=0, b=1, c=0;
		for(int i=1; i<=10; i++)
		{
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}
	}
	double multiplication(double n1, double n2)
	{
		return n1*n2;
	}	
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.Prime(); 
	}
}

class Student 
{
    	void Prime() 
	{
        	for (int num = 1; num <= 100; num++) 
		{
            		int count = 0;
            		for (int i = 1; i <= num; i++) 
			{
               			if (num % i == 0)
                    		count++;
           		}	
		        if (count == 2)
               	 		System.out.println(num + " is a Prime number");
        	}
    	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class main
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.Prime(); 
	}
}
class Student 
{
    	void Prime() 
	{
        	for (int num = 1; num <= 100; num++) 
		{
            		int count = 0;
            		for (int i = 1; i <= num; i++) 
			{
               			if (num % i == 0)
                    		count++;
           		}	
		        if (count == 2)
               	 		System.out.println(num + " is a Prime number");
        	}
    	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.Prime(); 
	}
}

class Student 
{
    	void Prime() 
	{
        	for (int num = 1; num <= 100; num++) 
		{
            		int count = 0;
            		for (int i = 1; i <= num; i++) 
			{
               			if (num % i == 0)
                    		count++;
           		}	
		        if (count == 2)
               	 		System.out.println(num + " is a Prime number");
        	}
    	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.Prime(); 
	}
}

class Student 
{
    	void Prime() 
	{
        	for (int x = 1; x <= 100; x++) 
		{
			int num=x,rem=0,rev=0;
			while(num != 0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num/=10;
			} 
		if(x==rev)
			System.out.println(x+ " :It is a Palidrome"); 
		else
			System.out.println(x+" :It is not a Palindrome");           		
        	}
    	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
 	public static void main(String args[])
	{
		College B = new College();
		B.BtechCourses(); 
	}
}



class College 
{
	String clgname = "CBIT", clgcode="Y673";
 	void collegeInfo() 
	{
		void Btech 
		{
			void BtechCourses()
			{
				String C1 = "CSE";
				String C2 = "CSDS";
				String C3 = "AIML";
				String C4 = "EEE";
				String C5 = "ECE";
			}
			void BtechFees()
			{ 
				int F1 = 120000;
				int F2 = 80000;
				int F3 = 75000;
				int F4 = 90000;
				int F5 = 87000;
			}
		}
		class Degree
		{
			void degreeCourses()
			{
				String C1 = "BSc";
				String C2 = "Bcom";
				String C3 = "BA";
			}
			void degreeFees()
 			{	
				int F1 = 20000;
				int F2 = 50000;
				int F3 = 75000;

			}
		}
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main {
    public static void main(String args[]) {
        College C = new College();
        C.collegeInfo();  

        System.out.println("College Name : " + C.clgname);
        System.out.println("College Code : " + C.clgcode);
        
        College.Btech btech = C.new Btech();
        College.Degree degree = C.new Degree(); 

        System.out.println("B.Tech Course : " + btech.BtechCourses());
        System.out.println("B.Tech Fees   : " + btech.BtechFees());
        System.out.println("Degree Course : " + degree.degreeCourses());
        System.out.println("Degree Fees   : " + degree.degreeFees());
    }
}

class College { 
    String clgname = "BVRIT";
    String clgcode = "E432";
							
    void collegeInfo() {
        System.out.println("College information is being displayed...");
    }

    class Btech {
        String BtechCourses() {
            return "CSE";
        }
        double BtechFees() {
            return 120000.00;
        }
    }
		
    class Degree {
        String degreeCourses() {
            return "B.Com";
        }
        double degreeFees() {
            return 89000.00;
        } 
    }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{
		Student s = new Student();
		float b = 45.3f;
		s.M1(b);
				
	}
}

class Student 
{
    	void M1(String a) 
	{
		System.out.println("String");
		        	
    	}
	void M1(float a) 
	{
		System.out.println("Float");
		        	
    	}
	void M1(short a) 
	{
		System.out.println("Short");
		        	
    	}
	
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{		
		double b = 34;
		Student S = new Student(b);	
	}
}

class Student 
{

    	Student(float x) 
	{
		System.out.println("float");
		        	
    	}
	Student(int x) 
	{
		System.out.println("int");
		        	
    	}
	Student(double x) 
	{
		System.out.println("Double");
		        	
    	}	
}*/
				
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String args[])
	{		
		Student S = new Student();
			
	}
}

class Student 
{
	int b = 159,rem=0,rev=0,count=0,copy=b,temp=b,sum=0;
    	Student() 
	{
		while(b != 0)
		{
			count++;
			b /=10;
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

/*class main
{
	int rolln;
 	String name;

	main(int rolln, String name)
	{
		this.rolln=rolln; this.name=name;
	}
	public static void main(String args[])
	{		
		main main = new main(12,"Navdeep");
		System.out.println(main.displayData());
		main main1 = new main(13,"Sandeep");
		System.out.println(main1.displayData());
		main main2 = new main(14,"Randeep");
		System.out.println(main2.displayData());

	}
	String displayData()
	{
		return rolln+" "+name;
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
 	int i;
	int j;
	int k;
 	main()
	{
		System.out.println("Default Constructor");
	}
	main()
	{
		System.out.println("Parameterized Constructor");
	}
	public static void main (String args[])
	{
		main main = new main(3,4,5);
		System.out.println(main.displayData());
	}
	int displayData()
	{
		return i+j+k;
	}
}*/
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	int roll;
	String name;
	main()
	{
		this(23);
		System.out.println("I'm  in default constructor");
	}
	main(int roll)
	{
		this(11, "depak");
		System.out.println("I'm in parameterized constructor with one parameter");
	}
	main(int roll, String name)
	{
		System.out.println("Im in parameterized constructor");
		this.roll=roll;
		this.name=name;
	}  
	String displayData()
	{
		return roll+" "+name;
	}

	public static void main(String args[])
	{
		main Main  = new main(12, "Ram");
		System.out.println(Main.displayData());
	}         
}*/                      

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	int roll;
	String name;
	
	main(int roll,String name)
	{
		this.roll = roll;
		this.name = name;
	}
	String displayData()
	{
		return roll+" "+name;
	}
	public static void main(String args[])
	{
		main main1 = new main(23,"Ravi");
		System.out.println(main1.displayData());	
		main main2 = new main(24,"Ram");
		System.out.println(main2.displayData());	
	}
}*/ 

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	int roll;
	String name;
	
	main(int roll,String name)
	{
		this.roll = roll;
		this.name = name;
	}
	main(int roll)
	{
		this(11, "Deepak");
		System.out.println("Default Constructor");
	}
	String displayData()
	{
		return roll+" "+name;
	}
	public static void main(String args[])
	{
		main main1 = new main(23,"Ravi");
		System.out.println(main1.displayData());	
		main main2 = new main(24,"Ram");
		System.out.println(main2.displayData());	
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main1 
{
	void eat() 
	{
        	System.out.println("Animal eats food.");
    	}
}

class Dog extends main1 
{
    	void bark() 
	{
        	System.out.println("Dog barks.");
    	}
}

public class main 
{
	public static void main(String[] args) 
	{
        	Dog myDog = new Dog();
        	myDog.eat();  
        	myDog.bark();
    	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class student 
{
	String name;
	int rollNo;
	int marks1;
	int marks2;

	void getData(String s, int r, int m1, int m2)
	{
		name = s;
		rollNo = r;
		marks1 = m1;
		marks2 = m2;
	}

	int total() 
	{
		return marks1+marks2;
	} 
	
	int avg()
	{
		return (marks1 + marks2)/2;
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class student1 extends student
{
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("roll no :"+rollNo);
		System.out.println("Marks1 :"+marks1);
		System.out.println("Marks2 :"+marks2);
		System.out.println("Total :"+total());
		System.out.println("Average :"+avg());
		System.out.println("--------------------------");


	}
}

class main 
{
	public static void main (String args[])
	{
		student1 r1 = new student1();
		student1 r2 = new student1();
		student1 r3 = new student1();
		
		r1.getData("John",1,45,49);
		r2.getData("Smith",2,35,46);
		r3.getData("Peter",3,50,36);

		r1.display();
		r2.display();
		r3.display();	
	}
}*/
		

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
/*class main extends main
{
	@Over0ide
	void m2() 
	{
		System.out.println("I'm overridenn");
	}
	public static void main(String args[])
	{
	}
}

abstract class parent 
{
	void m1()
	{
		System.out.println("Implemented Method");
	}
	abstract void m2();
}*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main 
{
	public static void main(String args[])
	{
		final void display() 
		{
        		System.out.println("This is a final method.");
    		}
	}
}*/

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 

/*class parent
{	

	void defaultMethod()
	{
		System.out.println("default Method");
	}
	
	protected void proMethod()
	{
		System.out.println("Protected Method");
	}
	
	public void pubMethod()
	{
		System.out.println("Public Method");
	}
}*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
/*class child extends parent
{
	void callMethods()
	{
		defaultMethod();
		proMethod();
		pubMethod();
		
	}
}

class main 
{
	public static void main(String args[])
	{
		child c = new child();
		c.callMethods();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	public static void main(String[] args) 
	{
		try 
		{
            		int a = 12/0;  
        	} 
		catch (ArithmeticException a) 
		{
            		System.out.println("Cannot divide by zero!");
        	}
		finally
		{
			System.out.println("This always executes");
		}
    	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class main
{
	void m1() throws ArithmeticException 
	{
	 	int a = 10 / 0; 
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		main obj = new main();
	
	try
	{
		obj.m1();  
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Settled");
	}

	finally
	{
		System.out.println("Finished");
	}
}

}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*public class main
{
	public static void main(String args[])
	{
		Runnable runnable1 = ()->
		{
			for(int x=0; x<=10; x++)
				System.out.println(Thread.currentThread().getName()+ "==>" +x);
		};
		Thread t1 = new Thread(runnable1,"Ajay");
		t1.start();
		Thread t2 = new Thread(runnable1,"Arun");
		t2.start();
		Thread t3 = new Thread(runnable1,"Amul");
		t3.start();

		for(int x=0; x<=6; x++)
			System.out.println(Thread.currentThread().getName()+ "==>" +x);
	}

}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Demo implements Runnable
{
	public void run()
	{
		for(int x=0; x<=5; x++)
			System.out.println(Thread.currentThread().getName()+ "==>" +x);
	}
}
class main
{
	public static void main(String args[])
	{
		
		Runnable r = new Demo();	
	
		Thread t1 = new Thread(r, "Rahul");
		t1.start();
		Thread t2 = new Thread(r, "Ram");
		t2.start();
		Thread t3 = new Thread(r, "Sam");
		t3.start();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*interface Animal 
{
	public void eat();
}

class dog implements Animal
{
 	public void eat()
	{
		System.out.println("Dog eats ");
	}
} 

class cat implements Animal
{
	public void eat()
	{
		System.out.println("Cat eats");
	}
}

class tiger implements Animal
{
	public void eat()
	{
		System.out.println("Tiger eats");
	}
}	

class main
{
	public static void main(String args[])
	{
		dog d = new dog();
		cat c = new cat();
		tiger t = new tiger();

		c.eat();
		t.eat();
		d.eat();
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//method overloading

/*class test
{
	void show(String a)
	{
		System.out.println("Hello");
	}
	
	void show(int b)
	{
		System.out.println(89);
	}
}

class main
{
	public static void main(String argss[])
	{
		test t = new test();
		t.show(12);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class x
{
	int add(int a, int b)	
	{
		return a+b;
	}

	int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

class main
{
	public static void main(String args[])
	{
		x y = new x();
		System.out.println(y.add(12,12));
		System.out.println(y.add(12,12,892));
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class display	
{
	void show(String a)
	{
		System.out.println("Hello");	
	}

	void show(int b)
	{
		System.out.println(34);
	}

	void show(double c)
	{
		System.out.println(23.43);
	}
	
	void show(char d)
	{
		System.out.println('D');
	}
}

class main
{
	public static void main(String args[])
	{
		display obj = new display();
		obj.show("Hello");
		obj.show(30);
		obj.show(25.00);
		obj.show('E');
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class display	
{
	String show(String a)
	{
		return "Hello";	
	}

	int show(int b)
	{
		return 34;
	}

	double show(double c)
	{
		return 3.43;
	}
	
	char show(char d)
	{
		return 'D';
	}
}

class main
{
	public static void main(String args[])
	{
		display obj = new display();
		System.out.println(obj.show("Hello"));
		System.out.println(obj.show(30));
		System.out.println(obj.show(25.00));
		System.out.println(obj.show('E')); 
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class Area 
{
	void findArea(int side)
	{
		System.out.println("Square area: " +(side * side));
	}
	
	void findArea(int length, int breadth)
	{
		System.out.println("Rectangle area:" +(length + breadth));
	}

	void findArea(double radius)
	{
		System.out.println("Circle area:" +(3.14 * radius * radius));
	}
}

class main
{
	public static void main(String args[])
	{
		Area a = new Area();
		a.findArea(23);
		a.findArea(10,15);
		a.findArea(23.31);
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*class test 
{
	static void show()
	{
		System.out.println("static method overloading");
	}
	
	static void show(String m)
	{
		System.out.println("Message " +m);
	}
}

class main 
{
	public static void main(String[] args) 
	{
        	test.show();
        	test.show("Hello Java");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*abstract class parent
{
	public abstract void gun();
}

class child extends parent 
{
	public void gun()
	{
		System.out.println("Override");
	}
}

class main
{
	public static void main(String args[])
	{
		child c = new child();
		c.gun();
	}
}*/

 
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
	
/*interface animal
{
	void eat();
	void grawl();
	void sleep();
}

class dog implements animal
{
	public void eat()
	{
		System.out.println("Dog is eating");
	}

	public void grawl()
	{
		System.out.println("Dog grawls");
	}
	
	public void sleep()
	{
		System.out.println("Dog is sleeping");
	}
}

class main
{
	public static void main(String args[])
	{
		animal a = new dog();

		a.eat();
		a.grawl();
		a.sleep();
	}
}*/		


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
/*class test 
{
	static void show()
	{
		System.out.println("static method overloading");
	}
	
	static void show(String m)
	{
		System.out.println("Message " +m);
	}
}

class main 
{
	public static void main(String[] args) 
	{
        	test.show();
        	test.show("T");
	}
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*class counter
{
	int count = 0;
	synchronized void increment() 
	{ 
        	count++;  
    	}
}

class main
{
	public static void main(String args[])
	{
		counter c = new counter();
		c.increment();
		c.increment(); 
		System.out.println("Count = " +c.count);
	}
}*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


class Counter 
{
	int count = 0;

    	synchronized void increment() 
	{
        	count++;
    	}
}


class MyThread extends Thread 
{
    	Counter c;
    	MyThread(Counter c) 
	{
        	this.c = c;
    	}
	
	public void run() 
	{
        	for (int i = 0; i < 1000; i++) 
		{
            		c.increment();
        	}
    	}
}

public class Main 
{
	public static void main(String[] args) throws Exception 
	{

        	Counter c = new Counter();

        	MyThread t1 = new MyThread(c);
        	MyThread t2 = new MyThread(c);

        	t1.start();
        	t2.start();

        	t1.join();
        	t2.join();

        	System.out.println("Final Count = " + c.count);
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class main
{
	public static void main(String args[])
	{
		int[] a = new int[]{10,20,30};
		
		for(int x=a.length-1; x>=0; x--)
		{
			System.out.println(x+"==>"+a[x]);
		}
			
	}
} 

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------








































































































































































	
 	