
public class AbstractKeyword {

    public static void main(String[] args){
        //abstract classes cannot be instantiated, but they can have a subclass
        //abstract methods are declared without an implementation

        AbstractKeywordCar car = new AbstractKeywordCar();
        //AbstactKeywordVehicle vehicle = new AbstactKeywordVehicle();

        car.go();


    }
}
