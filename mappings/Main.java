import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    // https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
    // https://medium.com/@kiarash.shamaii/list-map-vs-stream-map-in-java-44440284386
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 50));
        persons.add(new Person("Luke", 40));
        persons.add(new Person("Matthew", 60));
        persons.add(new Person("Mark", 70));
        
        
        List<String> nameList = mapList(persons, Person::getName);
        System.out.println(nameList);

        List<Integer> ageList = mapList(persons, Person::getAge);
        System.out.println(ageList);
    }

    public static <T, G> List<T> mapList(List<G> list, Function<G, T> mapper) {
        return list.stream().map(mapper).collect(Collectors.toList());
    }
}