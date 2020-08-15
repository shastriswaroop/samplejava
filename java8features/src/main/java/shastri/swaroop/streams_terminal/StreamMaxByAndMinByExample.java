package shastri.swaroop.streams_terminal;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;


public class StreamMaxByAndMinByExample {
    public static Optional<Student> getStudentByMaxGPA(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> getStudentByMinGPA(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));

    }

    public static void main(String[] args) {

        System.out.println(getStudentByMinGPA());
        System.out.println(getStudentByMaxGPA());
    }
}

