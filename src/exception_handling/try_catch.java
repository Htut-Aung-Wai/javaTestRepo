package exception_handling;
import java.util.Scanner;

public class try_catch {


    public static void main(String[] arg) {

        try_catch test=new try_catch();
        test.try_catch_testing(2,0);


    }

    public void try_catch_testing(int a,int b)
    {
        try {

            int result=a/b;


        } catch (ArithmeticException e)
        {

            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        finally
        {
            System.out.println("The code is completely complied");
        }

    }

}
