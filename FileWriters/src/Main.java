import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //need try and catch blocks
        try {
            FileWriter writer = new FileWriter("poem.txt");
            //to write to FileWriter object
            writer.write("Roses are red\nViolets are blue\nBooty booty booty");
            //add text to end of poem
            writer.append("\nA Poem by me");

            //close filewriter
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
