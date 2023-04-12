import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Daily_1365 {

     public static void main(String[] args) {
          int[] nums = {8,1,2,2,3};
          Arrays.stream(smallerNumbersThanCurrent1(nums)).forEach(System.out::println);
     }

     public static int[] smallerNumbersThanCurrent(int[] nums) {
          int[] arr = new int[nums.length];
          for (int i = 0; i < nums.length ; i++) {
               int cnt = 0;
               for(int j = 0; j < nums.length; j++) {
                    if(nums[j] < nums[i]) {
                         cnt++;
                    }
               }
               arr[i] = cnt;
          }

          return arr;
     }

     public static int[] smallerNumbersThanCurrent1(int[] nums) {
          Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
          int[] copy = nums.clone();

          Arrays.sort(copy);
          for (int i = 0; i < nums.length; i++) {
               myMap.putIfAbsent(copy[i], i);
          }

          for (int i = 0; i < nums.length; i++) {
               copy[i] = myMap.get(nums[i]);
          }

          return copy;

     }

     
}
