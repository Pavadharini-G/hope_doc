@FunctionalInterface
interface Math
{
    int add(int a,int b);
}
@FunctionalInterface
interface exercise
{
    void sayHello();
}
public class LambdaExample {
    public static void main(String[] args) 
    {
        Math obj=(a,b)->{
            System.out.println("Adding two numbers...");
            return a+b;
        };
        /*Math obj=new Math();{
            @Override
            public int add(int a,int b)
            {
                return a+b;
            }
        };*/
    }
}
