package shastri.swaroop;

import shastri.swaroop.data.Student;
import java.util.function.Supplier;
import java.util.Arrays;

public class MySupplierExample {
    public static void main(String[] args) {
        Supplier <Student> supplierInterface = () -> new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    }
}
