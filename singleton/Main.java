public class Main {
    public static void main(String[] args) {
        Person person1 = Person.createSinglePerson("Alice", 25);
        Person person2 = Person.createSinglePerson("Bob", 30);

        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}