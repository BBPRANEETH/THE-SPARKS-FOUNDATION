class SwapTwoNumbers
{
   public static void main(String[] args)
   { 
	int num1 = 5;
        int num2 = 10;
        num1 = num2 * num1; //10*5 = 50
        num2 = num1 / num2; //50/10 = 5
        num1 = num1 / num2; //50/5 = 10
        System.out.println("num1 = "+num1);
	System.out.println("num2 = "+num2);
   }                                             
}