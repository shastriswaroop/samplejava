package shastri.swaroop.core.annotation;

public class Dog extends Animal {
	@Override
	void eatSomething() {
		System.out.println("eating foods");// should be eatSomething
	}
}
