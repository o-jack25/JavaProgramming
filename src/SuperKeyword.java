
public class SuperKeyword {

    public static void main(String[] args){
        //keyword refers to the superclass(parent) of an object
        //ver similar to this "this" keyword

        SuperKeyWordHero hero1 = new SuperKeyWordHero("Batman", 42, "$$$");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        SuperKeyWordHero hero2 = new SuperKeyWordHero("Superman", 42, "everything");

        System.out.println(hero2.toString());

    }
}
