import java.util.Arrays;
class Numbers {
//binary search method: used to check low and high pts to find the target position the number is to be inserted
//we use the binary search Arrays method to simply this process since it will search for the position of a value
    public int searchInsert(int[] nums, int target) {
        if(Arrays.binarySearch(nums, target) < 0){
            if(nums[0] > target){//insert it into position 0
                    return 0;
                }
            else if(target > nums[nums.length-1]){
                return nums.length; //insert it into the position after last val
            }
            for(int i=0; i < nums.length - 1; i++){
                if(nums[i] < target && nums[i+1] > target){
                    //insert it into the position it should have
                    return i+1; //insert it into position between indxs
                }
            }
        }
        return Arrays.binarySearch(nums,target);//it has no place it can be put
    }
}