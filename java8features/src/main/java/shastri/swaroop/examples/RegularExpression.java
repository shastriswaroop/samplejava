package shastri.swaroop.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static final String regularExpression = "/^[a-z]{0,6}$/@hackerrank.com";

    public static void main(String[] args) {
        String line = "Swaroop_0@hackerrank.com";

        // Create a Pattern object
        Pattern r = Pattern.compile(regularExpression);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
