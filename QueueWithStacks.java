/**
 This class implements a queue with two stacks.

 Chapter 3.4
 Here the problem is to be held using two stacks and all functions should
 be implemented with those two stacks in use.

 Solution is to use one stack to hold the data ordered, then using the second function
 to be place holder when attempting to remove from the stack.

 It was pretty simple in trying to understand how to break up the problem since
 we are told to use two stacks to implement it.
*/

public class QueueWithStacks{

    public MyStack original; // store elements where top is last added
    public MyStack reverse; // use when trying to get first in original stack

    public void add(int item){
	original.push(item);
    }

    public int remove(){
	while(original.top != null){
	    reverse.push(original.pop());
	}
	int data = reverse.pop();
	while(reverse.top != null){
	    original.push(reverse.pop());
	}
	return data;
    }

    public int peek(){
	while(original.top != null){
	    reverse.push(original.pop());
	}
	int data = reverse.peek();
	while(reverse.top != null){
	    original.push(reverse.pop());
	}
	return data;
    }

    public boolean isEmpty(){
	return original == null;
    }
}
