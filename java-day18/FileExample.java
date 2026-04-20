import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) //throws IOException
    { //try and catch should be used when "throws IOException" is not used in the main func line
        try{ 
            File newFile=new File("test.txt");
            if(newFile.createNewFile())
            {
                System.out.println("File created: "+newFile.getName());
            }
            else{
                System.out.println("not able to create file");
            }
            System.out.println("File created");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        

    }
}
