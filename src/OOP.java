
public class OOP {

    public static void main(String[] args){
       //Object Oriented Programming
        //Instance of a class that contains attributes and methods

        //constructing instance of another class
        //myCar now contains everything in the class OOPCar
        OOPCar myCar = new OOPCar();

        //Creating a second car object from OOPCar
        OOPCar myCar2 = new OOPCar();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        System.out.println(myCar.price);

        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
        System.out.println(myCar2.price);

        //calling a method on myCar
        myCar.drive();
        myCar.brake();

        myCar2.drive();
        myCar2.brake();


    }
}
