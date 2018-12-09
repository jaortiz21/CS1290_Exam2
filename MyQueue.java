/**
 Class that implements a queue for int values.
*/

public class MyQueue{
    public static class QueueNode{
	public int data;
	public QueueNode next;

	public QueueNode(int data){
	    this.data = data;
	}
    }

    public QueueNode first;
    public QueueNode last;

    public void add(int item){
	QueueNode t = new QueueNode(item);
	if(last != null)
	    last.next = t;
	last = t;
	if(first == null)
	    first = last;
    }

    public int remove(){
	if(first == null)
	    return -1;
	int data = first.data;
	first = first.next;
	if(first == null)
	    last = null;
	return data;
    }

    public int peek(){
	if(first == null)
	    return -1;
	return first.data;
    }

    public boolean isEmpty(){
	return first == null;
    }
}
