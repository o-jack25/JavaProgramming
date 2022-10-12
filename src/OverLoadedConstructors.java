
public class OverLoadedConstructors {

    public static void main(String[] args){
         //multiple constructors within the same class with the same name
        //but have different parameters
        //name + parameters = signature

        //pizza object
        OverLoadedConstructorsPizza pizza = new OverLoadedConstructorsPizza("thicc crust");
        System.out.println("Here are the ingredients for the pizza ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


    }
}
