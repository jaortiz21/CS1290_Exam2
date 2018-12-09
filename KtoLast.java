
public class KtoLast{

    public static void main(String[] args){
	int[] a = {6,5,10,6,82,17,9,10,12,12,43};
	Node list = new Node(1);
	for(int i = 0; i < a.length; i++){
	    list.appendToTail(a[i]);
	}
	list.printList();
	Node k = kToLast(list,5);
	System.out.println(k.data);
    }

    public static Node kToLast(Node l, int k){
	if(l == null)
	    return null;
	Node fast = l;
	Node slow = l;
	int c = 1;
	while(fast.next != null){
	    if(c == k){
		fast = fast.next;
		slow = slow.next;
	    }else{
		fast = fast.next;
		c++;
	    }
	}
	return slow;
    }
}
