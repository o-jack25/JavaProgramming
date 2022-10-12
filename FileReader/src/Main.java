
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //read the contents of a file as a stream of characters one by one
        //read() returns an int value which contains the byte value
        //when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("art.txt");
            //storing byte value into data
            //need to add IO exception catch block
            int data = reader.read();
            while (data != -1) {
                //need to wrap char around variable
                System.out.print((char) data);
                data = reader.read();
            }
            //close reader
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
