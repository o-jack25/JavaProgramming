public class WrapperClasses {

    public static void main(String[] args){

        //provides a way to use primitive data types as reference data types
        //can be used with collections(ArrayList)
        //Strings are reference data types
        /* Primitive
            boolean char int double
           wrapper
            Boolean Character Integer Double
         */

        //creating reference types
        //each wrapper class may contain useful methods for your program
        //takes a lot more steps, standard primitive are a lot faster than reference types
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Jack";

        //unboxing
        if(a == true){
            System.out.println("This is true");
        }



    }

}
