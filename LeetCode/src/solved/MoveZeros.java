package solved;

import java.util.Arrays;

class MoveZeros {
    public void moveZeroes(int[] nums) {
    	int index = 0;
    	int len = nums.length;
    	for(int i = 0; i < len; i++) {
    		System.out.println("indes is   " + index);
    		if(nums[i] !=0) {
    		nums[index++] = nums[i];
    		}
    	}
    	for(int i = index; i < len; i++) {
    		nums[i] = 0;
    	}
    	
    	System.out.println(Arrays.toString(nums));
    }
    
    public static void main(String [] args) {
    	MoveZeros moveZeros = new MoveZeros();
    	int[] inp = {0,1,0,3,12};
    	moveZeros.moveZeroes(inp);
    }
}