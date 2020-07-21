package shastri.swaroop.methodreference;

import shastri.swaroop.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    static Supplier<Student> newStudent = Student::new;
    static Function<String,Student> fnStudent = Student::new;

    public static void main(String[] args) {
        System.out.println(newStudent.get());
        System.out.println(fnStudent.apply("swaroop"));
    }
}
