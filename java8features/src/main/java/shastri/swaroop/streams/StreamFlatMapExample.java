package shastri.swaroop.streams;

import shastri.swaroop.data.Student;
import shastri.swaroop.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamFlatMapExample {
    static List<String> studentActivities(){
        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
        return activities;
    }

    static List<String> studentActivitiesDistinct(){
        List<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
        return activities;
    }
    static long studentActivitiesDistinctCount(){
        long activityCount = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
        return activityCount;
    }


    static Set<String> studentActivitiesSet(){
        Set<String> activities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toSet());
        return activities;
    }

    public static void main(String[] args) {
        System.out.println(studentActivities());
        System.out.println(studentActivitiesDistinct());
        System.out.println(studentActivitiesDistinctCount());
        System.out.println(studentActivitiesSet());

    }
}
