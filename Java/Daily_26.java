public class Daily_26{
    public static int removeDuplicatesFromSortedArray(int[] nums){
        if(nums.length == 0) return 0;

        int curIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[curIndex]){
                curIndex++;
                nums[curIndex] = nums[i];
            }
        }

        return curIndex + 1;
    }
}