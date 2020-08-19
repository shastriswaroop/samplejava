package shastri.swaroop.core.annotation;

public class Hello {
	@MyAnnotation(value=10, value2="say", value3="3")
	public void sayhello() {System.out.println("Say hello");}
}
