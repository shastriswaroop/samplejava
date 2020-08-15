package shastri.swaroop.streams_terminal;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class StreamGroupingByExample {
    public static void showStudentsByGender(){
        Map<String,List<Student>> lstStudents =
                StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(lstStudents);
    }
    public static void showStudentsByGenderCustamized(){
        Map<String,List<Student>> lstStudents =
                StudentDataBase.getAllStudents()
                        .stream()
                        .collect(groupingBy((student)->student.getGpa()>3.8?"Outstanding":(student.getGpa()>3.5?"Average":"Poor")));

        System.out.println("Poor Students: " + lstStudents.get("Poor"));
        System.out.println("Outstanding Students: " +lstStudents.get("Outstanding"));
        System.out.println("Average Students: " +lstStudents.get("Average"));
    }


    public static void main(String[] args) {
        showStudentsByGender();
        System.out.println("================================");
        showStudentsByGenderCustamized();

    }
}
