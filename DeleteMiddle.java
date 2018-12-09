/**
 Class to delete the middle node of a list.
*/

public class DeleteMiddle{

    public static void main(String[] args){
	int[] a = {6,5,10,6,82,17,9,10,12,12};
	Node list = new Node(1);
	for(int i = 0; i < a.length; i++){
	    list.appendToTail(a[i]);
	}
	list.printList();
	deleteMiddle(list);
	list.printList();
    }

    public static void deleteMiddle(Node n){
	if(n == null|| n.next == null || n.next.next == null){
	    return;
	}
	Node t = n.next; //fast
	Node slow = n;
	Node prev = n;
	while(t != null){
	    if(t.next == null){
		prev = slow;
		slow = slow.next;
		break;
	    }
	    if(t.next.next == null){
		prev = slow;
		slow = slow.next;
		break;
	    }
	    t = t.next.next;
	    prev = slow;
	    slow = slow.next;
	}
	prev.next = prev.next.next;
    }
}
