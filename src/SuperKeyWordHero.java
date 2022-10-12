public class SuperKeyWordHero extends SuperKeywordPerson{

    String power;
    SuperKeyWordHero(String name, int age, String power){
        //refers to parent class
        super(name,age);
        this.power = power;
    }

    public String toString(){
        return super.toString()+this.power + "\n";
    }
}
