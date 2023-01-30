/**
 * Daily_2529
 * @author: Lê Thành Kiệt
 */

public class Daily_2529 {
     public static void main(String[] args) {
          int[] nums = {-3, -2, -1, 0, 0, 1, 2};
          System.out.println(maximumCount(nums));
     }

     public static int maximumCount(int[] nums){
          int pos = 0;
          int neg = 0;
          for(int i = 0; i < nums.length; i++){
               if(nums[i] > 0) pos++;
               if(nums[i] < 0) neg++;
          }

          return pos > neg ? pos : neg;
     }
     
}