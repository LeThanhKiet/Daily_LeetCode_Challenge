import java.util.Arrays;

public class Daily_217 {
     public static boolean containsDuplicate(int[] nums){
          Arrays.sort(nums);  
          for(int i = 0; i < nums.length - 1; i++){
               if(nums[i] == nums[i + 1]) return true;
          }
          

          return false;
     }
}
