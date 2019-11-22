package shastri.swaroop.hackerearth;

//What is the output?

public class Example3 {
	int b=9;
	int a;
	
	private int add() {
		return a+b;
	}
	 
	private int sum() {
		return a+b;
	}
	
	private int result() {
		return new Example3().add();
	}
	
	public static void main(String args[]) {
		
		Example3 exm =new Example3();
		System.out.println(exm.result()+exm.add()+exm.sum());
	}
}
