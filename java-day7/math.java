class calc
{
    int add(int num1,int num2)
    {
        return num1+num2;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    double add(double a,double b)
    {
        return a+b;
    }
}
public class math {
    public static void main(String[] args)
    {
        calc c=new calc();
        int ans=c.add(2,8);
        System.out.println(ans);
    }
}
/*this is an example of overloading.
for an example of overriding go to the notify.java doc.
the multiple send() in different classes is called overriding.
add @override in the lines before the multiple send() methods */