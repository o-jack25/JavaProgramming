public class OverLoadedConstructorsPizza {

    //declaring variables
    String bread;
    String sauce;
    String cheese;
    String topping;
    OverLoadedConstructorsPizza(String bread,String sauce,String cheese)
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;


    }
    OverLoadedConstructorsPizza(String bread,String sauce,String cheese,String topping)
    {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }
    OverLoadedConstructorsPizza(String bread,String sauce)
    {
        this.bread = bread;
        this.sauce = sauce;

    }
    OverLoadedConstructorsPizza(String bread)
    {
        this.bread = bread;
    }
    OverLoadedConstructorsPizza()
    {

    }


}
