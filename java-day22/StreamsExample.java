import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {

        List<Integer> numbs = List.of(2, 3, 4, 5, 6);

        List<Integer> multiplyBy2 = numbs.stream()
                                         .map(i -> i * 2)
                                         .toList();

        System.out.println(multiplyBy2);
    }
}

/*Employee(name,dept.salary,age)
            (dev,hr,support)
            1.filter by dept("dev")
            2.salary> 50k
            3.tot salary using sum() method
            4.avg salary average() method
            5.tot count of employee using count() methods */
