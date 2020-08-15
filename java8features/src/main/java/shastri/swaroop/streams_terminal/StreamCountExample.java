package shastri.swaroop.streams_terminal;

import shastri.swaroop.data.StudentDataBase;

public class StreamCountExample {
    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .count();
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
