import Person.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "12345");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getStudentId());
        // System.out.println(student.name);

    }
}