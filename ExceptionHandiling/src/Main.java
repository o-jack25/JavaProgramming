import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        event that occurs during the execution of a program that
        disrupts the normal flow of instructions
         */
        Scanner sc = new Scanner(System.in);
        //without try and catch block division by zero would throw an arithmetic error
        //surround dangerous could inside curly braces with try{]
        //catch(Exception e) catches a lot but good practice to specify the real error
        //finally block will always execute whether or not an expetion was caught
        try {

            System.out.println("enter a whole number to divide");
            int x = sc.nextInt();

            System.out.println("enter a number to divide by");
            int y = sc.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a number");

        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This will always print");
            sc.close();
        }


    }
}
