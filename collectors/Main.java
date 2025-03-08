import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Use tresSet
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(1);
        tree.add(4);
        tree.add(2);
        tree.add(8);
        for (Integer i : tree) {
            System.out.println("tree: " + i);
            System.out.println(i);
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(8);
        for (Integer i : list) {
            System.out.println("list: " + i);
            System.out.println(i);
        }

        TreeSet<Integer> tree2 = list.stream().collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        for (Integer i : tree2) {
            System.out.println("tree2: " + i);
            System.out.println(i);
        }

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 40));
        people.add(new Person("Eve", 35));
        people.add(new Person("Frank", 25));

        Map<Integer, List<Person>> map = people.stream().collect(Collectors.groupingBy(Person::getAge));

        for (Map.Entry<Integer, List<Person>> entry : map.entrySet()) {
            System.out.println("Age: " + entry.getKey());
            for (Person person : entry.getValue()) {
                System.out.println("Name: " + person.getName());
            }
        }

        int meanAge = people.stream().collect(Collectors.averagingInt(Person::getAge)).intValue();
        System.out.println("Mean age: " + meanAge);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 22));
        students.add(new Student("David", 23));

        List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());

        System.out.println(names);


    }
}