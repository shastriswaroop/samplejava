package shastri.swaroop;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;
import shastri.swaroop.functionalInterfaces.PredicateExample;
import shastri.swaroop.functionalInterfaces.PredicateStudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class MyBiFunctionExample {

    static BiFunction <List<Student>, Predicate<Student>, Map<String,Double>> biFunction = (studentList, predicate ) -> {
        Map<String, Double> gpaMap = new HashMap<>();
        for(Student student:studentList){
            if(predicate.test(student)){
                gpaMap.put(student.getName(),student.getGpa());
            }
        }
        return gpaMap;
    };

    public static void main(String[] args) {
        List<Student> stdList = StudentDataBase.getAllStudents();
        System.out.println(biFunction.apply( stdList, PredicateStudentExample.p2));
    }
}
