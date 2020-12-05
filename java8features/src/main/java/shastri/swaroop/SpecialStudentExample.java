package shastri.swaroop;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SpecialStudentExample {
    public static Predicate p = new Predicate() {
        @Override
        public boolean test(Object o) {
            Student std = (Student) o;
            if(std.getName().equalsIgnoreCase("Adam")){
         //       System.out.println("Adam found..");
                return true;
            }
            return false;
        }
    };
    public static void main(String[] args) {
        List<Student> lstStudents = StudentDataBase.getAllStudents();
       // lstStudents.stream().filter(p).collect(Collectors.toList());
//        System.out.println(lstStudents.stream().findFirst().filter(p).get());

        Optional<Student> std = lstStudents.stream().findFirst().filter(p);
        if(std.isPresent()) {
            System.out.println(std);
        }
//        System.out.println(lstStudents.stream().filter(p).collect(Collectors.toList()));
    }
}
