public class Daily_1 {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15}, target = 9;
        int res[] = twoSum(nums, target);
        for(int i : res){
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }

        throw new RuntimeException();
    }
}
