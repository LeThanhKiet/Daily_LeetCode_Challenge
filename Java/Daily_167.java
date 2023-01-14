import java.util.Arrays;
import java.util.*;

public class Daily_167 {
     public static void main(String[] args) {
          int[] nums = {3, 2, 3};
          System.out.println(majorityElement(nums));
     }

     public static int majorityElement(int[] nums){
          Arrays.sort(nums);
          return nums[nums.length / 2];
     }

     public static int majorityElement_test(int[] nums){
          int cnt = 0;
          HashMap<Integer, Integer> map = new HashMap<>();
     
          for(int i = 0; i < nums.length - 1; i++){
               cnt = 0;
               for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j]) {
                         cnt++;
                    }
               }
               map.put(cnt, nums[i]);
          }

          HashSet<Integer> set = new HashSet<>(map.keySet());
          int max = Collections.max(set);
          return map.get(max);
     }

     
}
