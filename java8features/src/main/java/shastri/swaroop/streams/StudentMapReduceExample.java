package shastri.swaroop.streams;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

public class StudentMapReduceExample {

    public static int getNotebookCount(){
        int numberOfBooks = StudentDataBase.getAllStudents().stream()
                .filter((student)->student.getGpa()>3.5)
             //   .filter((student)->student.getGender().equalsIgnoreCase("male"))
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);

        return  numberOfBooks;
    }

    public static void main(String[] args) {
        System.out.println(getNotebookCount());
    }
}
