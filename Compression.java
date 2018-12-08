import java.util.*;

/**
 Performs String compression to remove any repeated characters.
*/

public class Compression{

    public static void main(String[] args){
	String s1 = "aabcccccaaa";

	String s2 = compress(s1);

	System.out.println("Original String: " + s1);
	System.out.println("New String: " + s2);
    }

    public static String compress(String s1){
	char[] c1 = s1.toCharArray();

	String compressed = "";
	char lastSeen = c1[0];
	int lastCount = 1;
	for(int i = 1; i < c1.length; i++){
	    if(c1[i] == lastSeen){
		lastCount++;
	    }else{
		compressed += Character.toString(lastSeen);
		compressed += lastCount;
		lastCount = 1;
		lastSeen = c1[i];
	    }
	}
	//edge case
	compressed += Character.toString(lastSeen);
	compressed += lastCount;
	return compressed;
    }
}
