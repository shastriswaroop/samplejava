package shastri.swaroop.java_14;

public class StringAPI {
    public static void main(String[] args) {
        String str = "  ";
        String str1 = " L R ";

        System.out.println("#" + str.isBlank() + "#");
        System.out.println("#" + str1.strip()  + "#");
        System.out.println("#" + str1.stripTrailing() + "#");
        System.out.println("#" + str1.stripLeading() + "#");

        "Line1\nLine2\nLine3\rHello\n\rhi\r\nhello1".lines().forEach(System.out::println);
        "".lines().forEach(System.out::println);

        // Java 12
        System.out.println((String) "UPPER".transform(s->s.substring(2)));

        //Java 13
        System.out.println("My name is %s and my age is %d".formatted("Swaroop", 51));

        // Java 14 Additional context added in exception
        String NULL = null;
        System.out.println(NULL.isBlank());
        /*
        * Exception in thread "main" java.lang.NullPointerException:
        * Cannot invoke "String.isBlank()" because "NULL" is null
	        at com.acc.explore.java_14.StringAPI.main(StringAPI.java:24)
        * */

    }
}
