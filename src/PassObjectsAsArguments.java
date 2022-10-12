
public class PassObjectsAsArguments {

    public static void main(String[] args){
        PassObjectsAsArgumentsGarage garage = new PassObjectsAsArgumentsGarage();
        PassObjectsAsArgumentsCar car = new PassObjectsAsArgumentsCar("Bmw");

        PassObjectsAsArgumentsCar car1 = new PassObjectsAsArgumentsCar("Tesla");

        garage.park(car);
        garage.park(car1);



    }
}