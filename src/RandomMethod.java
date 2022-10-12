import java.util.Random;
public class RandomMethod {

    public static void main(String[] args){
        Random random = new Random();

        //psuedo random numbers

       double y = random.nextDouble();
       System.out.println(y);

       boolean z = random.nextBoolean();
       System.out.print(z);

    }
}
