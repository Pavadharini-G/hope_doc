import java.util.*;

class Student{
    int id;
    String name;
    int mark;
    Student(int id,String name,int mark)
    {
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public String toString()
    {
        return id+"-"+name+"-"+mark;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(3,"x",20));
        students.add(new Student(4,"q",40));
        students.add(new Student(1,"y",95));
        students.add(new Student(2,"m",55));
        students.add(new Student(5,"i",99));
        Comparator<Student> byId=new Comparator<Student>()
        {
            public int compare(Student a,Student b)
            {
                return Integer.compare(a.id,b.id);
            }
        };
        Collections.sort(students,byId);
        System.out.println("Shorted by id:"+students);
        Collections.sort(students,(a,b)->a.mark-b.mark);
        System.out.println("Shorted by mark:"+students);
    }
}
