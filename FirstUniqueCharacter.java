import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//Examples:
//
//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.


public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
       int [] charArray = new int[26];
       for(int i=0;i<s.length();i++){
    	   charArray[s.charAt(i)-'a']++;
       }
       for(int i=0;i<s.length();i++){
    	   if(charArray[s.charAt(i)-'a']==1)
    		   return i;
    	   
       }
       return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The answer is:"+firstUniqChar("loveleetcode"));
	}

}
