import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SumThree {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> resultList = new ArrayList<>();
    	Set<List<Integer>> resultSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                for(int k = 0; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
//                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                        resultSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
    
    public static void main(String [] args) {
    	int [] nums = {-1, 0, 1, 2, -1, -4};
    	SumThree sum = new SumThree();
    	System.out.println(sum.threeSum(nums));
    }
}