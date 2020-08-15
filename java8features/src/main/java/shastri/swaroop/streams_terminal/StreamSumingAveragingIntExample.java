package shastri.swaroop.streams_terminal;

import jdk.nashorn.internal.parser.JSONParser;
import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summingInt;

public class StreamSumingAveragingIntExample {
    public static int getNoteBooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static double getNoteBookAverage(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingDouble(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("total books with students is " + getNoteBooks());
        System.out.println("average books with students is " + getNoteBookAverage());

    }
}
