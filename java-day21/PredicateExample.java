import java.util.function.Predicate;

class student
{
    int mark;
}
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven=(n)->n%2==0;
        Predicate<student> isPass=(s)->s.mark>40;
        System.out.println(isPass.test());
        System.out.println(isEven.test(99999));
    }
}
