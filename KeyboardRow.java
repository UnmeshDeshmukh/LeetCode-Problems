import java.awt.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class KeyboardRow {
	 
	 public static String[] findWords(String[] words) {
         String[] keys = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"}; 
         Map<Character,Integer> keyRowValues = new HashMap<Character,Integer>();
         for(int i=0;i<keys.length;i++){
             for(int j=0;j<keys[i].length();j++)
                keyRowValues.put(keys[i].charAt(j),i);
              
         }
         LinkedList<String> result = new LinkedList<String>();
         for(int i=0;i<words.length;i++){
             int characterIndex = keyRowValues.get(words[i].charAt(0));
             for(int j=0;j<words[i].length();j++){
                 if(keyRowValues.get(words[i].charAt(j))!=characterIndex){
                     characterIndex = -1;
                     break;
                 }
             }
             if(characterIndex!=-1)
                result.add(words[i]);
         }
         return result.toArray(new String[0]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[]{"ALASLA","Dad","GLAD"};
		String[] result = findWords(words);
	}

}
