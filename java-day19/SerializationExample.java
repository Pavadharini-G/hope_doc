import java.io.*;

class Student implements Serializable
{
    String name;
    int mark;
    Student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(OutputStream objStream) throws IOException
    {
        super(objStream);
    }
}

public class SerializationExample
{
    public static void main(String[] args)throws IOException
    {
        Student s=new Student("XYZ",44);
        File file=new File("student.txt");
        FileOutputStream fo =new FileOutputStream(file,true);
        ObjectOutputStream objStream=new ObjectOutputStream(fo);
        if(file.length()==0)
        {
            objStream=new ObjectOutputStream(fo);
        }
        else{
            objStream=new CustomObjectOutputStream(fo);
        }
        objStream.writeObject(s);
        fo.close();
        objStream.close();
        System.out.println("Object serialized successfully!");
    }
}