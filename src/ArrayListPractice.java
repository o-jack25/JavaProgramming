import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args){
       /*
        ArrayList = a resizeable array;
        Elements can be added or removed after completion phase
        store reference data types
        */

        //need to use wrapper class, Integer
        ArrayList<String> food = new ArrayList<String>();

        //add elements
        food.add("pizza");
        food.add("hamburger");
        food.add("hot-dog");

        //set an element with something else: index, value;
        food.set(0,"steak");

        //remove an item
        food.remove(1);

        //clear array list
        food.clear();

        //usually would use .length but for lists you use .size
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }

}
