
public class MethodOverriding {

    public static void main(String[] args) {
        //declaring a method in subclass
        //which is already present in parent class
        //done so that a child class can give its own implementations

        MethodOverridingDog dog = new MethodOverridingDog();

        dog.speak();

        MethodOverridingAnimal animal = new MethodOverridingAnimal();
        animal.speak();
    }
}
