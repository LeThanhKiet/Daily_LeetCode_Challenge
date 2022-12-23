public class Daily_27{
    public static int removeElement(int[] nums, int val){
        if(nums.length == 0) return 0;
        int curIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[curIndex] = nums[i];
                curIndex++;
            }
        }

        return curIndex;
    }
}