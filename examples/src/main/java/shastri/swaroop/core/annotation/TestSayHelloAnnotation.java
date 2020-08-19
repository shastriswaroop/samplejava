package shastri.swaroop.core.annotation;

import java.lang.reflect.Method;

public class TestSayHelloAnnotation {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		
		Hello hello = new Hello();
		Method method = hello.getClass().getMethod("sayhello");
		MyAnnotation myAnnot = method.getAnnotation(MyAnnotation.class);
		System.out.println(myAnnot.value());
		System.out.println(myAnnot.value2());
		System.out.println(myAnnot.value3());
		
	}
}
