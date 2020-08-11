package shastri.swaroop.streams;

import shastri.swaroop.data.StudentDataBase;

public class StreamMatchExample {
    public static boolean allMatches(){
        return StudentDataBase.getAllStudents().stream()
        .allMatch((student) -> student.getGpa()>3.6);
    }
    public static boolean anyMatches(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch((student) -> student.getGpa()>3.6);
    }

    public static boolean noneMatches(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch((student) -> student.getGpa()>3.6);
    }

    public static void main(String[] args) {
        System.out.println("allMatches() : " + allMatches());
        System.out.println("anyMatches() : " + anyMatches());
        System.out.println("noneMatches() : " + noneMatches());

    }
}
