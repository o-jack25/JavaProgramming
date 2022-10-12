
public class Method {

    public static void main(String[] args) {
        //method = block of code executed whenever called upon

        int x = 3;
        int y = 3;

        //invoking method(calling method)
        //performs whatever is in that method
        String name = "jack";
        int age = 21;
        //passing an argument name
        hello(name, age);


        int z = sum(x,y);
        System.out.println(z);
        System.out.println(sum(x,y));
    }

    static void hello(String name, int age){//parameter name
        System.out.println("Hello " + name + " you are " + age);
    }
    static int sum(int x, int y){
        return x + y;
    }

    }
