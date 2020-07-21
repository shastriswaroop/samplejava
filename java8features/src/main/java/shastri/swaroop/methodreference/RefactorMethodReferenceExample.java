package shastri.swaroop.methodreference;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> p1 = (s)->s.getGpa()>=3.5;

    static Predicate<Student> p2 = RefactorMethodReferenceExample::getStudentForGpa;

    static boolean getStudentForGpa(Student s){
        return  s.getGpa()>=3.5;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
        System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
    }
}