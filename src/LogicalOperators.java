import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("You are playing a game press! w or W to exit ");
        String response = sc.next();

        if(response.equals("W") || response.equals("w")){
            System.out.println("You quit the game");

        }
        else{
            System.out.println("You are still playing the game");
        }

    }
}
