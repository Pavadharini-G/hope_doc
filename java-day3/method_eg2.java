public class method_eg2 {
    static int change(int x)
    {
        x=20;
        System.out.println("in method"+x);
        return x;// if we want the value to actually change then return it.
    }
    public static void main(String[] args)
    {
        int a=50;
        change(a); // do a=change(a); if you want the changed answer.
        System.out.println("outside method"+a);
    }
}
