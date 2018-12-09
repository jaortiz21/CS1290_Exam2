/**
 Implements a set of stacks that will expand and add 
 another if a threshhold is reached
*/

import java.util.*;

public class SetOfStacks{

    private int threshhold = 10;
    private int currentStack; //index of most recent stack in arraylist
    private int currentStackLength;
    ArrayList<MyStack> set;

    public SetOfStacks(){
	currentStack = 0;
	currentStackLength = 0;
	set = new ArrayList<>();
	set.add(new MyStack());
    }

    public int pop(){
	MyStack t = set.get(currentStack);
	if(t == null)
	    return -1;
	int data = t.pop();
	if(t == null && currentStack > 0){
	    currentStack--;
	    currentStackLength = 10;
	}
	if(t == null && currentStack == 0)
	    currentStackLength = 0;
	return data;
    }

    public void push(int item){
	MyStack t = set.get(currentStack);
	if(currentStackLength == 10){
	    //threshhold reached so create new Stack
	    MyStack n = new MyStack();
	    n.push(item);
	    set.add(n);
	    currentStackLength = 1;
	}else{
	    MyStack n = set.get(currentStack);
	    n.push(item);
	    currentStackLength++;
	    currentStack++;
	}
    }

    public int peek(){
	MyStack n = set.get(currentStack);
	if(n.top == null)
	    return -1;
	return n.top.data;
    }

    public boolean isEmpty(){
	return set.get(currentStack).top == null;
    }
}
