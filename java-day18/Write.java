import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("test.txt");
            writer.write("write using filewriter");
            writer.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
