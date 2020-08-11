package shastri.swaroop.streams;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {
    public static List<Student> studentList = StudentDataBase.getAllStudents();

    public static List<Student> sortStudent() {
        return studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(toList());
    }
    public static List<Student> sortStudentByGPA() {
        return studentList.stream().sorted(Comparator.comparing(Student::getGpa)).collect(toList());
    }
    public static List<Student> sortStudentByGPADescending() {
        return studentList.stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Sorted by Name");
        sortStudent().forEach(System.out::println);

        System.out.println("Sorted by GPA");
        sortStudentByGPA().forEach(System.out::println);

        System.out.println("Sorted by GPA Reversed");
        sortStudentByGPADescending().forEach(System.out::println);

    }
}
