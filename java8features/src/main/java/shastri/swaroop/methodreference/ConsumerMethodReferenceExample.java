package shastri.swaroop.methodreference;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    static Consumer<Student> consumerLamda = (student) -> System.out.println(student);
    static Consumer<Student> consumer = System.out::println;
    static Consumer<Student>consumerActivities = Student::printListOfActivities;
    public static void main(String[] args) {

      //  Student student = new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
        StudentDataBase.getAllStudents().forEach(consumerLamda);
        System.out.println("======================");
        StudentDataBase.getAllStudents().forEach(consumer);
        StudentDataBase.getAllStudents().forEach(consumerActivities);
    }
}
