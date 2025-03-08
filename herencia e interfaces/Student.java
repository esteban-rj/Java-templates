public class Student extends Person implements IStudent, IStudent2 {

    public Student(String name, int age) {
        System.out.println("Student construtor");
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I am a student");
    }

    @Override
    public void study() {
        System.out.println("I am studying");
    }

    @Override
    public void studyMore() {
        System.out.println("I am studying more");
    }
    
}
