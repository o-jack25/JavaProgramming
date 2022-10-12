import java.util.*;

public class ArrayLists2D {
    public static void main(String[] args){
        //2D ArrayList = dynamic list of lists
        //You can change the size of these lists during runtime

        //2D array list to contain other arrayLists
        ArrayList<ArrayList<String>> groceryList = new ArrayList();


        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Donuts");
        bakeryList.add("Garlic Bread");

        //System.out.println(bakeryList);
        //want to retrieve certain element
        //System.out.println(bakeryList.get(0));

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Potato");
        produceList.add("Zucchin");
        produceList.add("Stawberry");

        //System.out.println(produceList);

        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("beer");
        drinks.add("coke");
        drinks.add("sprite");
        //System.out.println(drinks);

        //adding lists to groceryList
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinks);

        System.out.println(groceryList);
        //you want to retrieve just one list and first element

        System.out.println(groceryList.get(2).get(1));








    }

}
