////Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
//Note:
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.
		
public class MoveZeroes {

	    public static void moveZeroes(int[] nums) {
	        int currentPtr=0;
	        int fastPtr = 0;
	        for(;currentPtr<nums.length;currentPtr++){
	            if(nums[currentPtr]!=0){
	            	int newVar = nums[currentPtr];
	            	nums[currentPtr] = nums[fastPtr];
	            	nums[fastPtr] = newVar; 
	            	fastPtr++;
	            }
	        }
	        for(int i=0;i<nums.length;i++){
	        	System.out.println(nums[i]);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}

}
