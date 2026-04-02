public class wrapper {
    public static Integer test1(String s)  //[2]
        {
            return Integer.valueOf(s);
        }
    public static void main(String[] args) {       
        Integer b=Integer.valueOf("123456");//return type -> object(Integer)   [1]
        //Integer c=Integer.parseInt("0987"); // return type -> int(int)         [1]
        int a=b.intValue();//unboxing in wrapping class -> accepts Integer and returns int  [3]
        System.out.println(a);  // [3]
        //System.out.println(b);   [1]
        //System.out.println(c);   [1]
        System.out.println(test1("123"));   //[2]
        Integer x=100;       //[4]
        Integer y=100;       //[4]
        System.out.println(x==y);  //[4]
        System.out.println(x.equals(y));  //[4]
    }
}
