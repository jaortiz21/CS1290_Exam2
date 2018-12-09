public class RemoveDups{

    public static void main(String[] args){
	int[] a = {6,5,10,6,82,17,9,10,12,12,43};
	Node list = new Node(1);
	for(int i = 0; i < a.length; i++){
	    list.appendToTail(a[i]);
	}

	list.printList();
	Node l = removeDups(list);
	l.printList();
    }

    public static Node removeDups(Node n){
	if(n == null)
	    return null;
	Node t;
	for(t = n; t != null; t = t.next){
	    Node u = t;
	    for(Node v = t.next; v != null; v = v.next){
		//System.out.println(t.data + " " + v.data);
		if(t.data == v.data){
		    u.next = v.next;
		}
	    }
	}
	return n;
    }
}
