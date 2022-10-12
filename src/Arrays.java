public class Arrays {

    public static void main(String[] args){
        /*
        //used to store multiple values in a single variable
        //have to be all same data type
        String[] cars = {"Camaro", "Mustang","Tesla", "BMW"};

        //listing element number
        cars[0] = "Charger";

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        //array with element size (3)
        String[] car = new String[3];

        car[0]= "Camaro";
        car[1]= "Mustange";
        car[2]= "Tesla";
        System.out.println(car[2]); */

        String[] car = new String[3];

        car[0]= "Camaro";
        car[1]= "Mustang";
        car[2]= "Tesla";

        //displays all elements in array car with counter i
        for(int i = 0; i < car.length; i++){
            System.out.println(car[i]);
        }


    }
}
