
public class SwitchStatements {

    public static void main(String[] args){

        //Good alternative if you have a lot of if's
        String dayOfTheWeek = "Tues";
        switch(dayOfTheWeek){
            case "Sunday":
                System.out.println("It is sunday!");
                break;
            case "Monday":
                System.out.println("It is mon!");
                break;
            case "Tues":
                System.out.println("It is tues!");
                break;
            case "Wed":
                System.out.println("It is wed!");
                break;
            case "Thursday":
                System.out.println("It is thurs!");
                break;
            case "Friday":
                System.out.println("It is fri!");
                break;
            case "Saturday":
                System.out.println("It is sat!");
                break;
            default:
                System.out.print("That is not a day");
        }
    }
}
