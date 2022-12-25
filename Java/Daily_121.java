public class Daily_121 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > maxProfit)
                maxProfit = prices[i] - min;
        }
        return maxProfit;
    }

    // Wrong Answer (Chỉ đúng test case mẫu) -- Lưu lại tham khảo
    public static int maxProfit1(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int min = prices[0];
        int index = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                index = i;
                min = prices[i];
            }
        }
        if (index == prices.length - 1)
            return 0;
        else {
            int max = prices[index];
            for (int i = index; i < prices.length; i++) {
                if (prices[i] > max) {
                    max = prices[i];
                }
            }

            return max - min;
        }
    }
}
