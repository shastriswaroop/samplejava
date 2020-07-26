package shastri.swaroop.streams;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StramsMapExample {
    public static List<String> nameList() {
        List<String> studentNames =
                StudentDataBase.getAllStudents().stream()
                        .map((Student::getName))
                        .map(String::toUpperCase)
                        .collect(toList());
        return studentNames;
    }
    public static Set<String> nameSet() {
        Set<String> studentNames =
                StudentDataBase.getAllStudents().stream()
                        .map((Student::getName))
                        .map(String::toUpperCase)
                        .collect(toSet());
        return studentNames;
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());

    }
}
