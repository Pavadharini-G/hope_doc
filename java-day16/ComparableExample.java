import java.util.*;

class Student implements Comparable<Student>
{
    String name;
    int mark;
    Student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s)
    {
        return this.mark-s.mark;
    }
    @Override
    public String toString()
    {
        return name+"-"+mark;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> stu=new ArrayList<>();
        stu.add(new Student("A",70));
        stu.add(new Student("B",55));
        stu.add(new Student("C",85));
        stu.add(new Student("D",60));

        Collections.sort(stu);
        System.out.println(stu);
    }
}
