public class Daily_35 {
    public static int searchInsert(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int m = (l + r) / 2;
        while(l <= r){
            m = (l + r) / 2;
            if(nums[m] == target){
                return m;
            } else if(nums[m] < target){
                l = m + 1;
            } else{
                r = m - 1;
            }
        }
        return l;
    }
}
