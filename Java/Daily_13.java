/**
 * Daily_13
 * @author: Lê Thành Kiệt
 */
public class Daily_13 {
     public static void main(String[] args) {
          String s = "MCMXCIV";
          System.out.println(romanToInteger(s));
     }

     public static int romanToInteger(String s){
        int num = 0;
        int res = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            switch(s.charAt(i)){
                case 'I' : res = 1; break;
                case 'V' : res = 5; break;
                case 'X' : res = 10; break;
                case 'L' : res = 50; break;
                case 'C' : res = 100; break;
                case 'D' : res = 500; break;
                case 'M' : res = 1000; break;
            }
            if(4 * res < num)
                num -= res;
            else
                num += res;
        }
        return num;
     }
     
}