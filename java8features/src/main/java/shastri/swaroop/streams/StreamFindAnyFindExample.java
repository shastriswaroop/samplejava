package shastri.swaroop.streams;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFindExample {
     public static Optional<Student> findAny(){
         return StudentDataBase.getAllStudents()
                 .stream()
                 .filter((student)->student.getGpa()>3.5)
                 .findAny();
     }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter((student)->student.getGpa()>3.5)
                .findFirst();
    }

    public static void main(String[] args) {
        if(findFirst().isPresent())
            System.out.println(findFirst());

        if(findAny().isPresent())
            System.out.println(findAny());

    }
}
