import java.util.*;

/**
 Checks to see if two strings are one permutation of the
 other. First string is args[0] and the second is args[1].
*/

public class CheckPermutation{

    public static void main(String[] args){
	String s1 = args[0];
	String s2 = args[1];

	if(checkPermutation(s1,s2))
	    System.out.println(s2 + " is a permutation of " + s1);
	else
	    System.out.println(s2 + " is not a permutation of " + s1);
    }

    public static boolean checkPermutation(String s1, String s2){
	char[] char1 = s1.toCharArray();
	char[] char2 = s2.toCharArray();
	Arrays.sort(char1);
	Arrays.sort(char2);

	if(char1.length != char2.length)
	    return false; // cannot be permutation if length is wrong
	
	// now check each char array with the other
	for(int i = 0; i < char1.length; i++){
	    if(char1[i] != char2[i])
		return false;
	}
	//if here then they must be permutatioin
	return true;y
    }
}
