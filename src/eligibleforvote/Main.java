package eligibleforvote;
public class Main {
    public static void main(String[] args)
    {
            int id;
            int age =17;
            if (age >= 18)
            {
                System.out.println("he/she is major so eligible for vote");
            }
            else if (age<=18)
            {
                System.out.println("he/she is minor so not eligible for vote");
            }
    }
}