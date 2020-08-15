package shastri.swaroop.streams_terminal;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamJoiningExample {
    public static String joining_1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining());
    }
    // joining with delimitor
    public static String joining_2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("~"));
    }

    public static String joining_3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("~","(",")"));
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());

    }
}
