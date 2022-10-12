public class Main {

    public static void main(String[] args){

        /*
        greek word for poly-"many" morph-"form"
        The ability of an object to identify as more than one type
        more than one data type
         */

        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        //attempt to store all objects in an array
        //does not work
        //Boat[] racers ={car,bike,boat};

        //need to use Super Class because all children identify as parent
        //need to do this to store objects in an array that have different types
        //Must all relate or identify as something similar
        Vehicle[] racers = {car,bike,boat};

        //this works below, but an enhanced for loop would be better
        //car.go();
        //bike.go();
        //boat.go();

        //iterate through the elements in the array vehicles
        for(Vehicle x : racers){
            x.go();
        }
    }
}
