
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        List<Double> squaredIntegers = numbers.stream().map(i -> Math.pow(i, 2)).collect(Collectors.toList());

        System.out.println(squaredIntegers);


        numbers.forEach(i -> { Double r = Math.pow(i, 2); System.out.println(r); });

        for (Integer i : numbers) {
            Double r = Math.pow(i, 2);
            System.out.println(r);
        }

        

    }
}