import java.util.Arrays;
import java.util.HashMap;
public class Daily_1 {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15}, target = 9;
        Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }

        throw new RuntimeException();
    }

    public static int[] twoSum1(int[] nums, int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                res[0] = i;
                res[1] = map.get(nums[i]);

                return res;
            } else{
                map.put(target - nums[i], i);
            }
        }

        return res;
    }
}
