public class Inheritance {

    public static void main(String[] args) {
        //process where one class acquires the attributes and methods of another

        InheritanceCar car = new InheritanceCar();
        //receives everything vehicle has
        car.go();

        InheritanceBicycle bike = new InheritanceBicycle();

        bike.stop();
        //prints  inherent values from vehicle class
        System.out.println(car.speed);
        System.out.println(bike.speed);

        //variable printed below is inside car class
        System.out.println(car.doors);
        //variable printed below is inside bike class
        System.out.println(bike.pedals);





    }
}
