package shastri.swaroop.linklist;

public class LinkList {
    Node head;
    private void add(Node node){
        node.nextNode = head;
        head = node;
    }

    private void reverse(){
        Node curr;
        Node prev;
        Node next;

        if(head!=null || head.nextNode != null){
            curr = head;
            prev = null;
            next = null;

            while(curr!=null){
                next = curr.nextNode;
                curr.nextNode = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
    }

    private void printList(){
        Node tmpNode = this.head;
        while (tmpNode!=null){
            System.out.println(tmpNode.value);
            tmpNode = tmpNode.nextNode;
        }
    }

    public static void main(String[] args) {

        LinkList l1 = new LinkList();
        l1.add(new Node(1));
        l1.add(new Node(2));
        l1.add(new Node(3));
        l1.add(new Node(4));
        l1.add(new Node(5));
        l1.printList();
        System.out.println("====================================");

        l1.reverse();
        l1.printList();
    }
}
