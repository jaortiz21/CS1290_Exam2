/**
 Class that implements a stack for int values.
*/

public class MyStack{
    public static class StackNode{
	public int data;
	public StackNode next;

	public StackNode(int data){
	    this.data = data;
	}
    }

    public StackNode top;

    public int pop(){
	if(top == null)
	    return -1;
	int item = top.data;
	top = top.next;
	return item;
    }

    public void push(int item){
	StackNode t = new StackNode(item);
	t.next = top;
	top = t;
    }

    public int peek(){
	if(top == null)
	    return -1;
	return top.data;
    }

    public boolean isEmpty(){
	return top == null;
    }
}
