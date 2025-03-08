
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println(intList);

        Integer[] intArray2 = {1, 2, 3, 4, 5};
        List<String> stringList = convertArrayToListAndType(intArray2, Object::toString);
        System.out.println(stringList);
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T, G> List<G> convertArrayToListAndType(T[] array, Function<T, G> function) {
        return Arrays.stream(array).map(function).collect(Collectors.toList());
    }
}