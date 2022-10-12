import java.util.Scanner;

public class HypotenuseTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side  1 (x): ");
        double sideOne = input.nextDouble();
        System.out.println("Enter side  2 (b): ");
        double sideTwo = input.nextDouble();

        double hypo = Math.sqrt((sideOne * sideOne)+(sideTwo * sideTwo));
        System.out.println("The hypotenuse of the triangle you entered is:  " + hypo);

        input.close();


    }
}
