public class Person {
    private static Person person;
    public String name;
    public int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public static Person createSinglePerson(String name, int age) {
        if (person == null) {
            person = new Person(name, age);
        }
        return person;
    }
    
}
