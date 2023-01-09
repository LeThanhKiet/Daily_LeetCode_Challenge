/**
 * Daily_14
 * @author: Lê Thành Kiệt
 */
public class Daily_14 {
     public static void main(String[] args) {
          String s[] = {"flower", "flow", "flight"};
          System.out.println(longestCommonPrefix(s));
     }

     public static String longestCommonPrefix(String[] strs){
          if(strs == null || strs.length == 0) return "";
          String res = strs[0];

          for(int i = 1; i < strs.length; i++){
               while(strs[i].indexOf(res) != 0){
                    res = res.substring(0, res.length() - 1);
               }
          }
          return res;

     }
     
}