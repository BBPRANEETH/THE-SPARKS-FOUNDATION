class Percentage
{
   public static void main(String[] args)
   {
   	String name = "Rakesh";
        int rollno = 23;
        int maths = 78;
        int telugu = 89;
        int science = 99;
        int hindi = 80;
        int social = 95;
        double total_marks = 500;
        double max_marks = telugu+science+maths+hindi+social;
        double percentage = max_marks/total_marks*100;
        System.out.println(max_marks);
        System.out.println(percentage);
    }
}