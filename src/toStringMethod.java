
public class toStringMethod {

    public static void main(String[] args){
        //toString()
        //returns a string that textually represents an object
        //can be used both implicitly and explicitly

        toStringMethodObject car = new toStringMethodObject();

        System.out.println(car.color);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.model);

        //address of car in memory
        System.out.println(car);

        car.toString();
        //textual representation of the object
        System.out.println(car.toString());

        //implicitly
        System.out.println(car);
    }
}
