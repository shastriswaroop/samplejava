package shastri.swaroop.datastructure.stack;

public class StackClient {

	public static void main(String [] args) {
		
		Stack stk = new Stack();
		stk.push("One");
		stk.push("Two");
		System.out.println(stk.isEmpty());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		stk.push("Two1");
		stk.push("Two2");
		stk.push("Two3");
		System.out.println(stk.isEmpty());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
	}
}
