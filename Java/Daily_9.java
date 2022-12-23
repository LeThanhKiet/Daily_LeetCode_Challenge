public class Daily_9 {
    public boolean isPalindrome(int x){
        int res = x;
        int check = 0;
        while(x != 0){
            if(x > 0){
                int tmp = x % 10;
                check = check * 10 + tmp;
                x /= 10;
            } else {
                int tmp = x % 10;
                check = check * 10 - tmp;
                x /= 10;
            }
        }

        if(check == res) return true;
        else return false;
    }
}
