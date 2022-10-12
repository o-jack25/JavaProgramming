import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args){
        //loop inside a loop
        Scanner sc = new Scanner(System.in);

        int rows, coloums;
        String symbol = "";

        System.out.println("Enter number of rows ");
        rows = sc.nextInt();
        System.out.println("Enter number of coloums ");
        coloums = sc.nextInt();
        System.out.println("Enter symbol to use ");
        symbol = sc.next();

        for (int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= coloums; j++){
                System.out.print(symbol);
            }
        }



    }
}
