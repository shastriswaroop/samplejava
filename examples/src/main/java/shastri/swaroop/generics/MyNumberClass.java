package shastri.swaroop.generics;

public class MyNumberClass <T extends Number>{
	Number number;
	MyNumberClass(T t){
		number = t.intValue();
	}
	
	public void setIntVlaue(T intT) {
		number = intT;
	}
	
	public Number getIntValue(){
		return number;
	}
}
