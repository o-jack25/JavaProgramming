import java.util.ArrayList;

public class ForEach {

    public static void main(String[] args){
        //enhanced for loop
        //traversing technique
        //iterate through elements in an array or collection

        //String[] animals = {"cat", "dog", "rat"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rat");
        animals.add("Bird");


        //less flexible, more readable
        for(String i : animals){
            System.out.println(i);
        }
    }
}
