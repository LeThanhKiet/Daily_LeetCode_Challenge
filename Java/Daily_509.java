public class Daily_509 {
     public static void main(String[] args) {
          int n = 3;
          System.out.println(fib(n));
     }

     public static int fib(int n){ // Recursion
          if(n <= 0) return 0;
          if(n <= 2) return 1;
          return fib(n - 1) + fib(n - 2);
     }

     public static int fib1(int n){ // Loop
          if(n <= 0) return 0;
          if(n <= 2) return 1;

          int f1 = 1, f2 = 1, sum = 0;
          for(int i = 3; i <= n; i++){
               sum = f1 + f2;
               f2 = f1;
               f1 = sum;
          }
          return sum;
     }

     
}
