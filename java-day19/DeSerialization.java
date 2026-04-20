import java.io.*;

public class DeSerialization {
    public static void main(String[] args) throws Exception
    {
        //Student s=new Student("XYZ",44);
        //File file=new File("student.txt");
        FileInputStream fi =new FileInputStream("student.txt");
        ObjectInputStream ObjStream=new ObjectInputStream(fi);
        //Student s=(Student)ObjStream.readObject();
        while(true)
        {
            try {
                Student s=(Student)ObjStream.readObject();
                System.out.println(s.name+" "+s.mark);
            } catch(EOFException e) {
                break;
            }
            
        }
        fi.close();
        ObjStream.close();
        System.out.println("Object serialized successfully!");
    }
}
