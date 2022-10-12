public class StaticKeywordModifyerObject {

    String name;
    static int numberOfFriends;
    StaticKeywordModifyerObject(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends);
    }
}
