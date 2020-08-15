package shastri.swaroop.streams_terminal;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class StreamsMapExample {
    public static void main(String[] args) {
        List<String> studentNameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println(" Student Name List : " + studentNameList);

        Set<String> studentNameSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));
        System.out.println(" Student Name Set : " + studentNameSet);
    }
}
