public class Solution {
    static Integer minSplit(int amount){
        int[] coins = {1, 5, 10, 20, 50};
        int count = 0;

        for (int i=coins.length - 1; i>=0; i--) {
            int divide = amount / coins[i];
            count += divide;
            amount -= divide * coins[i];
        }
        return count;
    }

}
