package functions;
import java.util.Scanner;

public class small_function

{
    public static void loop()
    {
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }

    public static void add_two_number()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstInput=in.nextInt();
        System.out.println("Enter your second number");
        int secondInput=in.nextInt();
        int c = firstInput+secondInput;
        System.out.println("Number is "+c);

    }
}
