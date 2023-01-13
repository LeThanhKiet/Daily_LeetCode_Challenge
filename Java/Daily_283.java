public class Daily_283 {
     public static void main(String[] args) {
          int[] nums = {0,1,0,3,12};
          moveZeroes(nums);  
          for(int i : nums){
               System.out.print(i + " ");
          }
     }

     public static void moveZeroes(int[] nums){
          int cur = 0;
          for(int i = 0; i < nums.length; i++){
               if(nums[i] != 0){
                    nums[cur] = nums[i];
                    cur++;
               }
          }
          for(int i = cur; i < nums.length; i++){ // Đẩy value 0 về cuối Array
               nums[i] = 0;
          }
     }
}
