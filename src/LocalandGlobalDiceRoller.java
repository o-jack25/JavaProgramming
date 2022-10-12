import java.util.Random;

public class LocalandGlobalDiceRoller {

    //constructor is same name as class name
    Random random;
    int number;
    LocalandGlobalDiceRoller(){
        random = new Random();
        number = 0;
        roll();
    }
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
