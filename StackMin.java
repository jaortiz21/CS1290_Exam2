/**
 Typical stack class that also implements a function that returns the minimum 
 value in the stack.
*/

import java.util.*;

public class StackMin{
    public static class StackNode{
	public int data;
	public StackNode next;

	public StackNode(int data){
	    this.data = data;
	}
    }

    public StackNode top;
    public StackNode min;
    LinkedList<StackNode> minList = new LinkedList<>();

    public int pop(){
	if(top == null)
	    return -1;
	int item = top.data;
	if(top == min)
	    min = minList.poll();
	top = top.next;
	return item;
    }

    public void push(int item){
	if(top == null){
	    top = new StackNode(item);
	    min = top;
	    return;
	}
	StackNode t = new StackNode(item);
	t.next = top;
	top = t;
	if(min.data > top.data){
	    minList.add(min); // keep track of min if min gets removed
	    min = top;
	}
    }

    public int peek(){
	if(top == null)
	    return -1;
	return top.data;
    }

    public int min(){
	return min.data;
    }


    public boolean isEmpty(){
	return top == null;
    }
}
