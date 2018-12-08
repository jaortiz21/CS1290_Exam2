import java.util.*;
/**
 * Program to take the first args variable as a String that we must determine
 * if it has a unique set of characters. Make all characters lowercase to check
 * for identical letter, so case is unimportant when determining uniqueness.
 *
 *
 *
*/
public class Unique{

    public static void main(String[] args){
	String test = args[0];
	if(isUnique(test))
	    System.out.println(test + " does have a unique set of characters.");
	else
	    System.out.println(test + " does not have a unique set of characters.");
    }

    public static boolean isUnique(String s){
	char[] characters = s.toLowerCase().toCharArray();
	for(int i = 0; i < characters.length; i++){
	    for(int j = i+1;j < characters.length; j++){
		if(characters[i] == characters[j])
		    return false;
	    }
	}
	return true;
    }
    
}
