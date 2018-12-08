import java.util.*;

/**
 Given a string, returns the same string with %20 instead of spaces.
*/

public class Urlify{

    public static void main(String[] args){
	String s = args[0];

	String urlify = urlify(s);
	System.out.println("Original string: " + s + "\nNew String: " + urlify);
    }

    public static String urlify(String s1){
	char[] c1 = s1.toCharArray();
	boolean spaceSeen = false;
	String urlify = "";
	String space = " ";
	for(int i = 0; i < c1.length; i++){
	    if(space.equals(Character.toString(c1[i]))  && !spaceSeen){
		spaceSeen = true;
		urlify += "%20";
	    }else if(!space.equals(Character.toString(c1[i]))){
		spaceSeen = false;
		urlify += c1[i];
	    }
	}
	return urlify;
    }
}
