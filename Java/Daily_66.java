/**
 * Daily_66
 */
public class Daily_66 {
     public static void main(String[] args) {
          int[] digits = {1, 2, 3};
          digits = plusOne(digits);
          for(int i : digits){
               System.out.print(i + " ");
          }
     }
     public static int[] plusOne(int[] digits){
          for(int i = digits.length - 1; i >= 0; i--){
               if(digits[i] < 9){
                    digits[i]++;
                    return digits;
               }
               digits[i] = 0;
          }

          digits = new int[digits.length + 1];
          digits[0] = 1;
          return digits;
     }
}