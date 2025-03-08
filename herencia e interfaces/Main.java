
import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        var student = new Student("John", 20);
        student.sayHello();
        student.walk();
        student.study();
        student.studyMore();

        //interpolacion 

        System.out.println("Hello, my name is " + student.getName() + " and I am " + student.getAge() + " years old");
    }
}
