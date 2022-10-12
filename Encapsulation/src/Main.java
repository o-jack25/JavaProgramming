
public class Main {

    public static void main(String[] args){
        //attributes of a class will be hidden or private
        //can be accessed only through methods(getters, setters)
        //You should make attributes private if you don't have a reason to make them public protected

        Car car = new Car("Chevy", "Camaro", 2021);
        //vars are private below
        //System.out.println(car.make);

        //asking please can I have the private through getter
        //retrieves all private variables
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        //How do we change private attributes of an object?? Setter method
        //below does not work have to create setter
        //car.year = 2022;

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


    }
}
