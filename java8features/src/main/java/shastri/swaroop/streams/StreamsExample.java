package shastri.swaroop.streams;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;
import shastri.swaroop.functionalInterfaces.PredicateStudentExample;
import java.util.function.Predicate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
    public static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    public static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void main(String[] args) {
        Map<String, List<String>> studentActivities =
/*
        StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
*/
        StudentDataBase.getAllStudents().stream()
                .peek((student)->{
                    System.out.println(student);
                })
                .filter(p1)
                .peek((student)->{
                    System.out.println("after 1st filter : " +student);
                })
                .filter(p2)
                .peek((student)->{
                    System.out.println("after 2nd filter : " +student);
                })
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentActivities);
    }
}
