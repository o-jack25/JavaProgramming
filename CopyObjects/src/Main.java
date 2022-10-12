public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Chevrolet", "Camaro", 2021);
        //Car car2 = new Car("Ford", "Mustang", 2022);

        //would like to copy the values from car1 to car2
        //below will not work! will copy the same car in memory
        //car2 = car1;

        //creating copy method in car.java
        //car2.copy(car1);

        //copying constructor
        //passing in car1 to car2
        //need to create an overload method in car.java
        //assigned values from car1 to car2 when we constructed car2 object
        Car car2 = new Car(car1);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());



    }
}
