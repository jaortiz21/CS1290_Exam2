public class Node{
    Node next = null;
    int data;

    public Node(int d){
	data = d;
    }

    void appendToTail(int d){
	Node end = new Node(d);
	Node n = this;
	while(n.next != null)
	    n = n.next;
	n.next = end;
    }

    void printList(){
	Node n = this;
	while(n != null){
	    System.out.print(n.data + " -> ");
	    n = n.next;
	}
	System.out.println("X");
    }
}
