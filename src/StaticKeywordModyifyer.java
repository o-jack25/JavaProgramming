public class StaticKeywordModyifyer {

    public static void main(String[] args){
        //static = modifier. single copy of a variable/method is created and shared
        //the class "owns" the static member
        StaticKeywordModifyerObject friend1 = new StaticKeywordModifyerObject("Bob");

        StaticKeywordModifyerObject friend2 = new StaticKeywordModifyerObject("Joe");
        System.out.println(StaticKeywordModifyerObject.numberOfFriends);
        StaticKeywordModifyerObject friend3 = new StaticKeywordModifyerObject("Joe");


        StaticKeywordModifyerObject.displayFriends();


    }
}
