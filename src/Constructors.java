
public class Constructors {

    public static void main(String[] args){
        //special method that is called when an object is created
        //pass in matching arguments to constructorsClass
        ConstructorsClass var1 = new ConstructorsClass("Rick", 65, 70);
        ConstructorsClass var2 = new ConstructorsClass("Morty", 16, 50);

        //can now create different objects with different attributes
        System.out.println(var1.name);
        System.out.println(var2.name);

        var1.drink();
        var2.eat();
    }
}
