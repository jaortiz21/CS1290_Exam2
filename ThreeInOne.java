/**
 This class implements an array that holds three separate 
 Stacks.
*/

public class ThreeInOne{

    public static void main(String[] args){
	
    }

    
    public MyStack[] threeInOne(){
	MyStack[] three = new MyStack[3];
	for(int i = 0; i < three.length; i++){
	    three[i] = new MyStack(); //place holders
	}
	return three;
    }
}
