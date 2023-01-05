public class Daily_125{
     public static boolean isPalindrome(String s){
     String news = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
     String res = new StringBuffer(news).reverse().toString();

     return res.equals(news);
    }
}