package shastri.swaroop.streams_terminal;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;


public class StreamGroupingByType2Example {

    public static void printGroupByLevel1(){
        Map<Integer, List<Student>> stdMap =
        StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel));

        System.out.println(stdMap);

    }
    public static void printGroupByLevel2(){
        Map<Integer, Map<String, List<Student>>> stdMap =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(groupingBy(Student::getGradeLevel,groupingBy(student -> student.getGpa()>3.5?"Outstanding":"Average")));

        System.out.println(stdMap);

    }


    public static void main(String[] args) {
        printGroupByLevel2();
    }
}
