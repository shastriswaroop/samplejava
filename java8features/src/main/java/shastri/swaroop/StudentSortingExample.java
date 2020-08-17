package shastri.swaroop;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class StudentSortingExample {
    static Consumer<Student> consumerLamda = (student) -> System.out.println(student);

    public static Comparator<Student> cmp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            Integer gradeO1 = o1.getGradeLevel();
            Integer gradeO2 = o1.getGradeLevel();

            return gradeO1.compareTo(gradeO2); // o1=o2
        }
    };

    public static Comparator<Student> cmp1 = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getGpa()>o2.getGpa()){
                return 1;
            } else if (o1.getGpa()< o2.getGpa()){
                return -1;
            } else {
                return 0;
            }
        }
    };

    public static Comparator<Student> cmpName = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };


    public static void main(String[] args) {
        List <Student> unsortedList = StudentDataBase.getAllStudents();
                unsortedList.stream()
                        .sorted(cmp1)
                .sorted(cmp1.thenComparing(cmpName).thenComparing(cmp))
                        .collect(toList())
                .forEach(System.out::println);
                ;
    }

}
