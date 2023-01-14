public class Daily_7 {
     public static void main(String[] args) {
          int x = 321;
          System.out.println(reverse(x));
     }

     public static int reverse(int x){
          int res = 0;
          while(x != 0){
               int newValue = res * 10 + x % 10;
               if((newValue - (x % 10)) / 10 != res) return 0;

               res = newValue;
               x /= 10;

          }
          return res;
     }
}
