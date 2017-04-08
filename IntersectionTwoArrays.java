import java.util.HashSet;
import java.util.Set;

//Given two arrays, write a function to compute their intersection.
//
//Example:
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].


public class IntersectionTwoArrays {
	
	public static int[] intersection(int[] nums1, int[] nums2) {
	        
			Set<Integer> set = new HashSet<Integer>();
	        Set<Integer> resultset = new HashSet<Integer>();
			for(int i=0;i<nums1.length;i++){
	            set.add(i);
	        }
	        for(int i=0;i<nums2.length;i++){
	        	if(set.contains(nums2[i])){
	        		resultset.add(nums2[i]);
	        	}
	        }
	        int[] result = new int [resultset.size()];
	      	int i=0;
	      	for(Integer num:resultset){
	      		result[i++] = num;
	      	}
	      	return result;
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1};
		int [] nums2 = {1};
		int [] result = intersection(nums1, nums2);
		for(int i=0;i<result.length;i++)
			System.out.println(result[i]);
	}

}
