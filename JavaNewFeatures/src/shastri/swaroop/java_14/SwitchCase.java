package shastri.swaroop.java_14;

public class SwitchCase {
    public static void main(String [] args) {
        String day = "MONDAY";

    System.out.println("JAVA : " + returnValueUsingOldStyle (day));
        // Java 14
    System.out.println("JAVA 14: " + returnValueUsingJava14Style(day));

    }

    public static int returnValueUsingJava14Style(String day){
        return switch (day){
            case "MONDAY","TUESDAY" ->1; //{} add logic
            case "SUNDAY", "SATURDAY" ->7;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
    }

    public static int returnValueUsingOldStyle(String day){
        int number = 0;
        switch (day){
            case "MONDAY":
                number = 1;
                break;
            case "SATURDAY":
                number = 6;
                break;
            case "SUNDAY":
                number = 7;
                break;
            default:
                number = 0;
        }
        return number;
    }
}