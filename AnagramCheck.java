//Given two strings s and t, write a function to determine if t is an anagram of s.
//
//For example,
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false.
//
//Note:
//You may assume the string contains only lowercase alphabets.
public class AnagramCheck {
	public static boolean isAnagram(String a,String b){
		if(a.length()!=b.length())
			return false;
		else{
			int [] letterArray = new int[26];
			for(int i=0;i<a.length();i++){
				letterArray[a.charAt(i) - 'a']++;
				letterArray[b.charAt(i) - 'a']--;
			}
			for(int count:letterArray){
				if(count!=0)
					return false;
			}
		}
				
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abbbbb";
		String b = "babbbb";
		System.out.println(isAnagram(a, b));
	}

}
