package shastri.swaroop.examples;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;

public class PrintClassLoaders {
    public static void main(String[] args) {
        System.out.println("Classloader of this class:"
                + PrintClassLoaders.class.getClassLoader());

        System.out.println("Classloader of Logging:"
                + Logging.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());    }
}
