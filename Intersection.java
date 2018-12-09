/**
 This class implements a method that finds whether two linked
 lists intersect, that is having an element in both that has the same reference.
*/

public class Intersection{

    public static void main(String[] args){
	
    }

    public static boolean intersect(Node l1, Node l2){
	if(l1 == null || l2 == null)
	    return false;
	for(Node n = l1; n != null; n = n.next){
	    for(Node t = l2; t != null; t = t.next){
		//check reference value
		if(n == t)
		    return true;
	    }
	}
	return false;
    }
}
