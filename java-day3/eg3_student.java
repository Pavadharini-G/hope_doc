public class eg3_student {
    //method using object
    int marks;   
    static void change(eg3_student s)
    {
        s.marks=20;
        System.out.println("in method"+s.marks);
    }
    public static void main(String[] args)
    {
        eg3_student s1=new eg3_student();
        s1.marks=80;
        change(s1);
        System.out.println("outside method"+s1.marks);
    }
}
