public class OverLoadedMethods {

    public static void main(String[] args){
        //methods that share the same name but have different parameters
        //method name + parameters = method signature

        double x = add(2.2,3.3,4.4,5.4);
        System.out.println(x);
    }

    static int add(int a, int b){
        System.out.println("This is overloaded method 1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method 2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method 3");
        return a + b + c + d;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method 1");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method 2");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method 3");
        return a + b + c + d;
    }

}
