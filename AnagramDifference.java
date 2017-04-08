import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramDifference {
	
	public static int[] getMinimumDifference(String[] a, String[] b){
		int[] result = new int [a.length];
		int differentCount = 0;
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<a.length;i++){
			if(a[i].length()!=b[i].length()) {
				result[i]= -1;
				continue;
			}
			else{
				for(int j=0;j<a[i].length();j++)
					hm.put(a[i].charAt(j), 1);
				for(int k=0;k<b[i].length();k++){
					if(hm.containsKey(b[i].charAt(k))){
						continue;
					}else{
						differentCount++;
					}
					
				}
				result[i] = differentCount;
				differentCount= 0;
			}

		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"bb"};
		String[] arrB = {"def"};
		int [] result = getMinimumDifference(arr, arrB);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
