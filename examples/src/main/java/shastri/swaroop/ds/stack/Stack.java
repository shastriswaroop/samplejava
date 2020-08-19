package shastri.swaroop.ds.stack;

import shastri.swaroop.ds.linklist.Node;

public class Stack {
	Node first = null;
	
	public void push(String str) {
		Node oldNode = first;
		Node node = new Node();
		node.item = str;
		node.next = oldNode;
		first = node;
	}
	
	public String pop() {
		if(!isEmpty()) {
			Node top = first;
			first = first.next; 
			return top.item;
		}
		return null;
	}
	
	public boolean isEmpty() {
		if(first == null)
			return true;
		else 
			return false;
	}	
}
