package shastri.swaroop;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class StudentSortingExample {

    public static Comparator<Student> cmp = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            Integer gradeO1 = s1.getGradeLevel();
            Integer gradeO2 = s2.getGradeLevel();

            return gradeO1.compareTo(gradeO2);
        }
    };

    public static Comparator<Student> cmp1 = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if(s1.getGpa()==s2.getGpa())
                return 0;
            if(s1.getGpa()>s2.getGpa()){
              return 1;
            }
            return -1;
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
    }

}
