import java.util.Arrays;
public class Daily_1365 {

     public static void main(String[] args) {
          int[] nums = {8,1,2,2,3};
          int[] arr = smallerNumbersThanCurrent(nums);
          Arrays.stream(arr).forEach(System.out::println);
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

     
}
