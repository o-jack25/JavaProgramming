import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = "";

        while(name.isBlank()){
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("hello " + name);
    }
}
