/**
 Class that sorts a stack so that the smallest items are at 
 the top.
*/

public class SortStack{

    public static void main(String[] args){
	
    }

    public static MyStack sort(MyStack s){
	MyStack t = new MyStack();
	MyStack rev = new MyStack();
	t.push(s.pop());
	while(s.top != null){
	    int curr = s.pop();
	    if(t.peek() < curr){
		while(t.top != null){ //push into rev to fit new item
		    rev.push(t.pop());
		}
		//rev now has sorted stack into reverse
		boolean currPushed = false;
		while(rev.top != null){
		    if(rev.peek() < curr && !currPushed){
			t.push(curr);
			currPushed = true;
		    }else{
			t.push(rev.pop());
		    }
		}
	    }
	}
	return t;
    }
}
