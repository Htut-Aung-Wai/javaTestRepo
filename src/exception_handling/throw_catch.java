package exception_handling;

public class throw_catch {



    public static void main (String[] args){

        System.out.println("Exception handling and throwing");

        try {checkAge(20);}
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }



    }


    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        } else {
            System.out.println("Age is valid.");

        }
    }
}
