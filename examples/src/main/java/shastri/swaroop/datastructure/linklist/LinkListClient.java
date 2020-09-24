package shastri.swaroop.datastructure.linklist;

public class LinkListClient {
	public static void main(String [] args) {
		LinkList lst = new LinkList();
		lst.addLast("one");
		lst.addLast("two");
		lst.addLast("four");
		lst.printlist();
		System.out.println("===========");
		lst.addAfter("two", "three");
		
		lst.printlist();
		System.out.println("===========");
		
		lst.removeNode("one");
		lst.printlist();
	}
}
