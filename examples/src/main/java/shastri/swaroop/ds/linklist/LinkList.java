package shastri.swaroop.ds.linklist;

public class LinkList {
	Node head = null;
	
	public void addLast(String strItem) {
		Node oldhead = head;
		Node node = new Node();
		node.item = strItem;
		node.next = oldhead;
		head = node;		
	}
	
	public void addAfter(String strItem, String value) {
		if (head.item == strItem) {
			addLast(value);
		} else { 
		
			Node refNode = head;
			Node prevNode = null;
			while(refNode.item != strItem) {
				prevNode = refNode;
				refNode = refNode.next;
			}
			Node newNode = new Node();
			newNode.item = value;
			newNode.next = refNode;
			prevNode.next = newNode;
		}
	}
	
	public void deleteLast() {
		if(head != null)
			head = head.next;
	}
	
	public void removeNode(String delitem) {
		Node refNode = head;
		Node prevNode = null;
		while(refNode.item != delitem) {
			prevNode = refNode;
			refNode = refNode.next;
		}
		prevNode.next = refNode.next;
	}
	
	public void printlist() {
		Node headnode = head;
		while(headnode!=null) {
			System.out.println(headnode.item);
			headnode = headnode.next;
		}
	}
}
