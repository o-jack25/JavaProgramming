
public class ArrayOfObjects {

    public static void main(String[] args){
        int[] numbers = new int[3];
        char[] charcters = new char[4];
        String[] strings = new String[5];

        //array that hold 3 food objects
        ArrayOfObjectsObject[] food = new ArrayOfObjectsObject[3];

        ArrayOfObjectsObject food1 = new ArrayOfObjectsObject("pizza");
        ArrayOfObjectsObject food2 = new ArrayOfObjectsObject("hamburger");
        ArrayOfObjectsObject food3 = new ArrayOfObjectsObject("hot-dog");

        //store food items in food objects
        food[0] = food1;
        food[1] = food2;
        food[2] = food3;

        //returns address
        System.out.println(food[0]);
        //returns string
        System.out.println(food[0].name);
        System.out.println(food[1].name);
        System.out.println(food[2].name);


    }
}
