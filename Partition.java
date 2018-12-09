/**
 Implements a method that partitions a linked list to be before 
 and after an x value. If x value is within the linked list, it
 is to appear on the right side (greater side) of the linked list.
*/

public class Partition{

    public static void main(String[] args){
	int[] a = {6,5,10,6,82,17,9,10,12,12,43};
	Node list = new Node(1);
	for(int i = 0; i < a.length; i++){
	    list.appendToTail(a[i]);
	}
	list.printList();
	Node partition = partition(list,15);
	partition.printList();
    }

    public static Node partition(Node n, int x){
	Node less = new Node(1); //delete at end
	Node greater = new Node(1); //delete at end
	for(Node t = n; t != null; t = t.next){
	    if(t.data >= x)
		greater.appendToTail(t.data);
	    else
		less.appendToTail(t.data);
	}
	less = less.next;
	greater = greater.next;
	if(less == null)
	    return greater;
	if(greater == null)
	    return less;
	Node t = less;
	while(t.next != null)
	    t = t.next;
	t.next = greater;
	return less;
    }
}
