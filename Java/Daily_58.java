public class Daily_58{
    public static void main(String[] args) {
        String s = "Le Thanh Kiet";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        if(s.length() == 0) return 0;
        int cnt = 0;
        String[] res = s.split(" ");
        for(int i = 0; i < res[res.length - 1].length(); i++){
            cnt++;
        }

        return cnt;
    }

    public static int lengthOfLastWord1(String s){
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}