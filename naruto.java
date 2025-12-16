public class ninja
{
  public static void main(String[] args)
    {
      int n=9;
      int square = 1;
      int cube = 1;
      int i=1;

       while(i<3)
        {
         square*=n;
         i++;
        }
       while(i<3)
       {

         cube*=n;
        i++;
         }
         System.out.println(square);
         System.out.println(cube);
         
     